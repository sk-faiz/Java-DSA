import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(9);

        System.out.println(list);
        list.set(0, 10);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(3));
    }
}
