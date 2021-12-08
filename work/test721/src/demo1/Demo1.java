import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int n = 0;
        Random r = new Random();
        n = r.nextInt(100)+1;
        int guess = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你猜测的数字");
        guess = sc.nextInt();
        while(guess != n){
            if (guess > n){
                System.out.println("您猜的数字太大了！");
            }
            if(guess < n){
                System.out.println("您猜的数字太小了");
            }
            System.out.println("请输入你猜测的数字");
            guess = sc.nextInt();
        }
        System.out.println("恭喜你猜对了！");


    }
}

