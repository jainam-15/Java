import java.util.ArrayList;
import java.util.Collections;

class arraylists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(3);
        
        System.out.println(list);

        int element = list.get(1);

        System.out.println(element);

        list.add(1, 7);

        System.out.println(list);

        list.set(0, 6);

        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        Collections.sort(list);
    }
}