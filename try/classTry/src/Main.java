import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int b = 0;
            int i = 0;
            String []arr = new String[200];
            String s1 = in.nextLine();
            int a = s1.indexOf(" ");
            while(a <= s1.length() && s1.indexOf(" ",b)>0)
            {
                arr[i] = s1.substring(b,a);
                b = a+1;
                a = s1.indexOf(" ",b);
                i++;
            }
            arr[i] = s1.substring(b);
            for(int j = i;j>=0;j--)
            {
                System.out.print(arr[j]+" ");
            }
        }
    }
}