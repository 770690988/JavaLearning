package com.lesson.first.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectLesson {

    public static void main(String[] args) throws Exception {
        TargetClass target = new TargetClass("a");
        System.out.println("name:" + target.getName() + " secret:" + target.getSecret());
        doSomething(target);
        System.out.println("after name:" + target.getName() + " secret:" + target.getSecret());
        if (target.getName().equals("b") && target.getSecret().equals("replaced")) {
            System.out.println("seems u know how to set field value with reflection");
        } else {
            System.out.println("u still need to think");
        }
        TargetClass newTarget = newInstanceWithReflection();
        System.out.println("new target name:" + newTarget.getName());
    }

    private static void doSomething(TargetClass target) throws Exception {
        //全类名方式（配置文件）
        //Class targetClass1 = Class.forName("com.lesson.first.reflect.TargetClass");
        //多用于参数的传递
        //Class targetClass2 = TargetClass.class;
        //多用于对象的获取字节码的方式
        Class targetClass3 = target.getClass();


        //Field[] fields = targetClass1.getFields();获取public修饰的成员变量
        Field targetName = targetClass3.getDeclaredField("name");
        //访问前先忽略安全权限修饰符检查(暴力反射)
        targetName.setAccessible(true);
        targetName.set(target,"b");

        Field targetSecret = targetClass3.getDeclaredField("secret");
        targetSecret.setAccessible(true);
        targetSecret.set(target,"replaced");
    }

    private static TargetClass newInstanceWithReflection() throws Exception {
        Class targetClass1 = TargetClass.class;
        Constructor constructor = targetClass1.getDeclaredConstructor(String.class,String.class,boolean.class);
        constructor.setAccessible(true);
        Object target1 = constructor.newInstance("虞程龙年薪百万","年薪百万",true);
        return (TargetClass)(target1);
    }

}



