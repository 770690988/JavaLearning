import java.util.ArrayList;
import java.util.Random;

public class Demo6 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        int rr;
        for (int i = 0; i < 100; i++) {
            rr = r.nextInt(100)+1;
            list1.add(rr);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)%2 == 0){
                list2.add(list1.get(i));
            }
        }

        System.out.println("第一个集合为："+list1);
        System.out.println("第二个集合为："+list2);
        System.out.println("偶数总共有："+list2.size());


    }
}
