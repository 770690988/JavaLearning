package com.it;
import org.spring.

public class Testloc {
    public static void main(String[] args) {
        //1.初始化spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过容器获取userDao实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
    }
}
