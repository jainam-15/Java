

public class occurence {

    public static int firstOccurrence(String str, char n, int j) {
        if(j >= str.length()) {
            return -1;
        }
        
        if(str.charAt(j) == n) {
            return j;
        }
        return firstOccurrence(str, n, j+1);
    }

    public static int lastOccurrence(String str, char n, int j) {
        if(j < 0) {
            return -1;
        }
        
        if(str.charAt(j) == n) {
            return j;
        }
        return lastOccurrence(str, n, j-1);
    }

    public static void main(String[] args) {
        
        String str = "sdjghsdbvsjf";
        char n = 's';

        int first = firstOccurrence(str, n, 0);
        int last = lastOccurrence(str, n, str.length() - 1);

        if(first != -1) {
            System.out.println("First occurrence at index " + first);
        } else {
            System.out.println("Character not found");
        }

        if(last != -1) {
            System.out.println("Last occurrence at index " + last);
        }
    }
}