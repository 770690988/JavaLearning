package com.lesson.first.reflect;


public class TargetClass {
    public final String name;
    private String secret;

    public TargetClass(String name){
        this(name,"secret",false);
    }

    private TargetClass(String name,String secret,boolean fromReflect){
        this.name=name;
        this.secret=secret;
        if(fromReflect){
            System.out.println("seems u know new instance with reflection");
        }
    }

    public String getName(){
        return name;
    }

    private void setSecret(String secret){
        this.secret=secret;
    }

    public String getSecret(){
        return secret;
    }
}


