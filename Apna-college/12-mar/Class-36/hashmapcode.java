
import java.util.*;

public class hashmapcode {

    static class hashmap<k, v> {

        private class node {
            k key;
            v value;

            public node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<node> buckets[];

        public hashmap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashfunction(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchinll(k key, int bi) {
            LinkedList<node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<node> oldbucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<node> ll = oldbucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    node nod = ll.get(j);
                    put(nod.key, nod.value);
                }
            }
        }

        public void put(k key, v value) {
            int bi = hashfunction(key);
            int di = searchinll(key, bi);

            if(di == -1) {
                buckets[bi].add(new node(key, value));
                n++;
            } else {
                node nod = buckets[bi].get(di);
                nod.value = value;
            }

            double lambda = (double)n/N;

            if(lambda > 2.0) {
                rehash();
            }
        }

        public boolean containskey(k key) {
            int bi = hashfunction(key);
            int di = searchinll(key, bi);

            if(di == -1) {
                return false;
            } else {
                return true;
            }
        }

        public v remove(k key) {
            int bi = hashfunction(key);
            int di = searchinll(key, bi);

            if(di == -1) {
                return null;
            } else {
                node nod = buckets[bi].remove(di);
                n--;
                return nod.value;
            }
        }

        public v get(k key) {
            int bi = hashfunction(key);
            int di = searchinll(key, bi);

            if(di == -1) {
                return null;
            } else {
                node nod = buckets[bi].get(di);
                return nod.value;
            }
        }

        public ArrayList<k> keyset() {
            ArrayList<k> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    node nod = ll.get(j);
                    keys.add(nod.key);
                }
            }
            return keys;
        }

        public boolean isempty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        hashmap<String, Integer> map = new hashmap<>();

        map.put("India", 190);
        map.put("china", 100);
        map.put("USA", 50);

        ArrayList<String> keys = map.keyset();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}
