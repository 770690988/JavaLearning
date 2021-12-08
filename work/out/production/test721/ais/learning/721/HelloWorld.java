import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("请输入数组的长度");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size+1];
        int temp = 0;
        for (int i = 1; i <= size ; i++) {
            System.out.println("请输入第"+i+"个数据的值为：");
            Scanner value = new Scanner(System.in);
            temp = value.nextInt();
            array[i] = temp;
        }
        System.out.println("====================");
        System.out.println("处理前的数据为：");
        daYing(array);
        for (int i = 1; i <= size/2; i++) {
            temp = array[i];
            array[i] = array[size-i+1];
            array[size-i+1] = temp;
        }
        System.out.println("====================");
        System.out.println("处理后的数据为：");
       daYing(array);
        Phone xiaoMi = new Phone();
        xiaoMi.name = "苹果";
        System.out.println(xiaoMi.name);

    }

    public static void daYing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.println("第"+i+"个数据为："+array[i]);
        }
    }



}
