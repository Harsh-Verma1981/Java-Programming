// ============================================================
//  IMPORTS — bringing in tools from Java's built-in library
// ============================================================

// ArrayDeque is the actual class that gives us a working Deque object.
// Think of it as the physical "plate stack" sitting in memory.
import java.util.ArrayDeque;

// Deque is just the blueprint (interface) that describes what
// operations a double-ended queue must support (push, pop, peek...).
// We use Deque as the TYPE, and ArrayDeque as the actual OBJECT.
// Why? Because using the interface type makes code more flexible.
import java.util.Deque;

// This is a built-in Java exception we throw when someone tries to
// pop/peek from an empty stack — like trying to remove a plate
// from an empty pile.
import java.util.EmptyStackException;


// ============================================================
//  WHAT IS A Deque AND WHY ARE WE USING IT AS A STACK?
// ============================================================
//
//  Deque = "Double Ended Queue" (pronounced "deck")
//  It can add/remove from BOTH ends (front and back).
//
//  A normal stack only works from one end (top).
//  Deque can do that too — we just only use one end (the front).
//
//  Java actually has an old Stack class, but it's outdated and slow.
//  The modern recommended way to make a stack in Java is:
//
//      Deque<Something> stack = new ArrayDeque<>();
//
//  And then use:
//      stack.push()  → adds to the front (the "top")
//      stack.pop()   → removes from the front (the "top")
//      stack.peek()  → looks at the front WITHOUT removing it
//
//  That's it. We only ever touch the front, so it behaves
//  exactly like a stack of plates.
// ============================================================


public class MinMaxStack {

    // ==========================================================
    //  WHAT IS A "record"?
    // ==========================================================
    //
    //  A record is a special, short way to create a simple class
    //  whose only job is to HOLD DATA together.
    //
    //  Normally, to bundle 3 values together you'd write a full class:
    //
    //      class Entry {
    //          int value, min, max;
    //          Entry(int value, int min, int max) {
    //              this.value = value;
    //              this.min   = min;
    //              this.max   = max;
    //          }
    //          int value() { return value; }
    //          int min()   { return min;   }
    //          int max()   { return max;   }
    //      }
    //
    //  A record does ALL of that automatically in one line:
    //
    //      record Entry(int value, int min, int max) {}
    //
    //  Java auto-generates:
    //    - a constructor  → new Entry(value, min, max)
    //    - getter methods → entry.value(), entry.min(), entry.max()
    //    - equals, hashCode, toString (bonus freebies)
    //
    //  Think of Entry as a single PLATE in our plate-stack analogy.
    //  Each plate remembers:
    //    value → the actual number on that plate
    //    min   → smallest number seen from the BOTTOM up to THIS plate
    //    max   → largest  number seen from the BOTTOM up to THIS plate
    // ==========================================================

    private record Entry(int value, int min, int max) {}


    // ==========================================================
    //  THE INTERNAL STACK
    // ==========================================================
    //
    //  This is the actual pile of plates living inside our class.
    //  Each "plate" is one Entry object (value + min + max).
    //
    //  Deque<Entry>   → a stack that holds Entry objects
    //  ArrayDeque<>() → the actual implementation we're using
    //
    //  "private" → only this class can see it (nobody outside)
    //  "final"   → the variable itself can't be reassigned to
    //              a different object (but we can still add/remove
    //              elements inside it — final doesn't freeze contents)
    // ==========================================================

    private final Deque<Entry> stack = new ArrayDeque<>();


    // ==========================================================
    //  PUSH — add a new number on top
    // ==========================================================
    //
    //  This is where the "memory trick" happens.
    //  We calculate the new min and max AT PUSH TIME
    //  so we never have to search for them later.
    // ==========================================================

    public void push(int value) {

        if (stack.isEmpty()) {
            // Stack is completely empty — this is the very first plate.
            // There's nothing to compare against, so:
            //   min = this value (it's the only one, so it's the smallest)
            //   max = this value (it's the only one, so it's the largest)
            stack.push(new Entry(value, value, value));

        } else {
            // Stack already has plates. Look at the TOP plate's memory
            // (stack.peek() returns the top Entry WITHOUT removing it).
            //
            // stack.peek().min() → what was the min BEFORE this push?
            // stack.peek().max() → what was the max BEFORE this push?
            //
            // Now compare: is the new value smaller/larger than what
            // was already the min/max? Take whichever is correct.

            int newMin = Math.min(value, stack.peek().min());
            //  Example: value=3, top plate says min was 5
            //  Math.min(3, 5) = 3 → new plate remembers min = 3

            int newMax = Math.max(value, stack.peek().max());
            //  Example: value=8, top plate says max was 5
            //  Math.max(8, 5) = 8 → new plate remembers max = 8

            // Create a new plate with:
            //   - the actual value
            //   - the freshly calculated min for this moment in time
            //   - the freshly calculated max for this moment in time
            stack.push(new Entry(value, newMin, newMax));
        }
    }


    // ==========================================================
    //  POP — remove the top plate and return its value
    // ==========================================================
    //
    //  stack.pop() removes the top Entry and returns it.
    //  We only give back the VALUE (the actual number),
    //  not the min/max — those were internal bookkeeping.
    //
    //  After this, the plate BELOW automatically becomes the new top,
    //  and its min/max are already correct for the new state.
    //  No recalculation needed — that's the whole point!
    // ==========================================================

    public int pop() {
        if (stack.isEmpty()) throw new EmptyStackException();
        // .pop()    → removes top Entry from the stack
        // .value()  → gets just the int value from that Entry
        return stack.pop().value();
    }


    // ==========================================================
    //  PEEK — look at the top value WITHOUT removing it
    // ==========================================================
    //
    //  peek() is like looking at the top plate label
    //  without picking it up. Stack stays unchanged.
    // ==========================================================

    public int peek() {
        if (stack.isEmpty()) throw new EmptyStackException();
        // .peek()   → looks at top Entry WITHOUT removing it
        // .value()  → gets just the int value from that Entry
        return stack.peek().value();
    }


    // ==========================================================
    //  getMin — get the current minimum in O(1) time
    // ==========================================================
    //
    //  We just look at the TOP plate's "min" memory.
    //  The top plate already knows the min of the entire stack
    //  because we calculated it at push time.
    //
    //  No loop. No searching. Just one lookup.
    // ==========================================================

    public int getMin() {
        if (stack.isEmpty()) throw new EmptyStackException();
        // .peek()  → top Entry (don't remove)
        // .min()   → the min that was recorded when this plate was placed
        return stack.peek().min();
    }


    // ==========================================================
    //  getMax — get the current maximum in O(1) time
    // ==========================================================
    //
    //  Same idea as getMin — the top plate's "max" memory
    //  already holds the answer for the whole stack right now.
    // ==========================================================

    public int getMax() {
        if (stack.isEmpty()) throw new EmptyStackException();
        return stack.peek().max();
    }


    // ==========================================================
    //  isEmpty — check if the stack has no plates
    // ==========================================================

    public boolean isEmpty() {
        return stack.isEmpty();
    }


    // ==========================================================
    //  MAIN — step-by-step demo showing exactly what happens
    // ==========================================================

    public static void main(String[] args) {

        MinMaxStack s = new MinMaxStack();

        // ---- push(5) ----
        // Stack is empty, so min = max = 5
        // Internal state: [ Entry(value=5, min=5, max=5) ]
        s.push(5);

        // ---- push(3) ----
        // Top plate says min=5, max=5
        // newMin = Math.min(3, 5) = 3
        // newMax = Math.max(3, 5) = 5
        // Internal state: [ Entry(5,5,5), Entry(3,3,5) ]   ← top is right side
        s.push(3);

        // ---- push(8) ----
        // Top plate says min=3, max=5
        // newMin = Math.min(8, 3) = 3
        // newMax = Math.max(8, 5) = 8
        // Internal state: [ Entry(5,5,5), Entry(3,3,5), Entry(8,3,8) ]
        s.push(8);

        // ---- push(1) ----
        // Top plate says min=3, max=8
        // newMin = Math.min(1, 3) = 1
        // newMax = Math.max(1, 8) = 8
        // Internal state: [ Entry(5,5,5), Entry(3,3,5), Entry(8,3,8), Entry(1,1,8) ]
        s.push(1);

        // Top plate is Entry(1, 1, 8)
        System.out.println(s.getMin());  // prints: 1  → top plate's min memory
        System.out.println(s.getMax());  // prints: 8  → top plate's max memory

        // ---- pop() ----
        // Removes Entry(1, 1, 8). The "1" plate is gone.
        // New top is Entry(8, 3, 8)
        // That plate ALREADY remembered min=3, max=8 from when IT was pushed.
        s.pop();

        // New top plate is Entry(8, 3, 8)
        System.out.println(s.getMin());  // prints: 3  ← instantly correct, no scanning!
        System.out.println(s.getMax());  // prints: 8
    }
}