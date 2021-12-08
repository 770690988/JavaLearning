public class Student {
    private int num;//学生的学号
    private int age;//学生的年龄
    private String name;//学生的名字
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int num, int age, String name) {
        this.num = num;
        this.age = age;
        this.name = name;
    }
}
