import java.util.ArrayList;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        Random r = new Random();
        int rr;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            rr = r.nextInt(33)+1;
            list.add(rr);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
