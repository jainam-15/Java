
public class tries {

    static class node {

        node[] children = new node[26];
        boolean eow;

        public node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static node root = new node();

    public static void insert(String word) {
        int level = 0;
        int len = word.length();
        int idx = 0;

        node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key) {
        int level = 0;
        int len = key.length();
        int idx = 0;

        node curr = root;

        for (; level < len; level++) {
            idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordbreak(String key) {
        int len = key.length();

        if(len == 0) {
            return true;
        }

        for (int i = 0; i < len; i++) {
            
            if (search(key.substring(0, i))) {
                wordbreak(key.substring(i));
                return true;
            }
        }

        return false;
    }

    public static boolean startswith(String prefix) {
        node curr = root;
        for(int i = 0; i< prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static void longestword(node root, StringBuilder curr) {
        
        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null &&  root.children[i].eow == true) {
                curr.append((char)(i + 'a'));
                if(curr.length() > ans.length()) {
                    ans = curr.toString();
                }

                longestword(root.children[i], curr);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }

    public static String ans = "";

    public static void buildtrie(String str) {
        root = new node();

        for (int i = 0; i < str.length(); i++) {
            insert(str.substring(i));
        }
    }

    public static int countnodes(node root) {
        if(root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null) {
                count += countnodes(root.children[i]);
            }
        }
        return 1+count;
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }

        System.out.println("thee -> " + search("thee"));
        System.out.println("thor -> " + search("thor"));

        System.out.println(startswith("c"));

    }
}
