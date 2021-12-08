import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("刘燕");
        System.out.println(success);
        list.add("胡卓然");
        list.add("黄家畅");
        list.add("费静晨");
        list.add("杨铄");
        System.out.println(list);

        System.out.println(list.get(1));

        String whoRemoved = list.remove(0);
        System.out.println("被删除的人是："+whoRemoved);
        System.out.println(list);
        int size = list.size();
        System.out.println("集合的长度是："+ size);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        int outside = listC.get(0);
        System.out.println(outside);




    }
}
