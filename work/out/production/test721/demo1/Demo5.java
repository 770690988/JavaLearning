import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("胡卓然");
        list.add("杨铄");
        list.add("黄家畅");
        list.add("虞程龙");
        System.out.println(list);

        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+"@");
        }
        System.out.println(list.get(list.size()-1)+"}");
    }
}
