
public class move {

    public static void move(String str, int idx, int count, String newstr) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            count++;
            move(str, idx + 1, count, newstr);
        } else {
            newstr += currchar;
            move(str, idx + 1, count, newstr);
        }
    }

    public static void main(String[] args) {

        String str = "axcbxxd";
        move(str, 0, 0, "");

    }
}
