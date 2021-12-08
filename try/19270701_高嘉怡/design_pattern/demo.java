package com.lesson.design_pattern;

public class demo {
    public static void main(String[] args) {
        IndexOutOfBoundsException t = new IndexOutOfBoundsException();
        ResponseFactory factory = ResponseFactory.getInstance();
        Response br= factory.make(t);
        br.doPrint();

        String des = "This is a Header";
        Response hr = factory.make(des);
        hr.doPrint();
    }
}
