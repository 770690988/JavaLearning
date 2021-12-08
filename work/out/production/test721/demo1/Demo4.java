import java.sql.SQLOutput;
import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student(20273139, 21,"虞程龙");
        Student two = new Student(20273138, 21,"杨铄");
        Student three = new Student(20273137, 21,"黄家畅");
        Student four = new Student(20273136, 21,"胡卓然");
        
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ",年龄" + stu.getAge() + ",学号" + stu.getNum());
        }

    }


}
