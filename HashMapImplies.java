import java.util.*;
public class HashMapImplies {
    /* 
        HashMap implementation:

        *  it is implemented as an array of linked List 
           which means it contains the different linked list in it's block of Memory
           ex- Array containing all head nodes of diff L.L.
            |header1|header2|header3|header4| 
               ^
               | 
               header1 -> India,12 -> Russia, 9 -> null
        
        * Each block of individual index in the array is called as our bucket

        * there are two parameters to maintain the T.C for the push method
           i.e. n = no of nodes(every node of every linked list)
           and N = no of blocks of the array
           
        * there exist a hash function which check the key value 
           if the key is present in this it will just ignore else it give some bucket index where the node is created in that bucket 
           in which some key is passed and that hash function returns the bucket index 
           if the key value is same it returns the same bucket index 

        * then a lambda comes i.e 
           λ <= K(which is some constant value) or called as threshold value 
           λ = n/N (total no of nodes / total no of buckets in the array) 

        * when the value of the λ is greater than or equal to the k(threshold value)
          there comes a special function i.e. re-hashing 
          if λ increases the the T.C of put func is also increases which is not good
          beacuse  the T.C of put is O(λ)
          to reduce the value of λ we need to increase the no of buckets 
          i.e. incresing the size of an array now let's suppose we take the array of double size 
          now we will putting all of the nodes form the current array to the new array which is of double size 
          ex if I am putting my value {India : 1} to hash func so it is can change the bucket index of India let's say back then the bucket index 
          of India is 1 now it can be 3 based on the hash func because hash function has to spread the nodes to make the buckets stable 
    
    */

    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no of nodes
        private int N; // size of an array

        // Array of Linked List
        private LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i = 0;i < 4;i++){
                // creating an empty linked list to store the values in it 
                // if no empty L.L is there we can't be able to add the elements
                this.bucket[i] = new LinkedList<>();
            }
        }
        
        private int hashfunction(K key){ // 0 to N - 1
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = bucket[bi];
            int data_index = 0;

            for(int i = 0;i < ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                    }
                }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbucket[] = bucket;
            bucket = new LinkedList[N * 2];

            for(int i = 0; i < N * 2;i++){
                bucket[i] = new LinkedList<>();
            }

            for(int i = 0; i < oldbucket.length;i++){
                LinkedList<Node> ll = oldbucket[i];

                for(int j = 0;j < ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashfunction(key);
            int data_index = searchInLL(key, bi);
            // di = -1 then key does not exist 
            if(data_index == -1){
                bucket[bi].add(new Node(key, value));
                n++;
            }
            else{// key is already exist in the linked list 
                Node node = bucket[bi].get(data_index);
                node.value = value;
            }

            double lambda = (double)n/N;

            if(lambda > 2.0){
                // rehashing
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashfunction(key);
            int data_index = searchInLL(key, bi);
            // di = -1 then key does not exist 
            if(data_index == -1){
                return false;
            }
            else{// key is already exist in the linked list 
                return true;
            }

        }

        public V remove(K key){
            int bi = hashfunction(key);
            int data_index = searchInLL(key, bi);
            // di = -1 then key does not exist 
            if(data_index == -1){
                return null;
            }
            else{// key is already exist in the linked list 
                Node node = bucket[bi].remove(data_index);
                return node.value;
            }
        }

        public V get(K key){
            int bi = hashfunction(key);
            int data_index = searchInLL(key, bi);
            // di = -1 then key does not exist 
            if(data_index == -1){
                return null;
            }
            else{// key is already exist in the linked list 
                Node node = bucket[bi].get(data_index);
                return node.value;
            }
        }
            
        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0;i < bucket.length;i++){
                LinkedList<Node> ll = bucket[i];
                for(int j = 0;j < ll.size();j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 190);
        map.put("China", 200);
        map.put("USA", 50);

        ArrayList<String> keys = map.keyset();
        for(int i = 0;i < keys.size();i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("USA");
        System.out.println(map.get("USA"));

    }
}