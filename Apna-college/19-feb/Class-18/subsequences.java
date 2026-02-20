public class subsequences {

    public static void subsequences(String str, int idx, String newstr) {
        if(idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);

        subsequences(str, idx+1, newstr+currchar);

        subsequences(str, idx+1, newstr);

    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");

    }
}