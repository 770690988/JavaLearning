package com.lesson.design_pattern;

public class HeaderResponse implements Response{
    public String des;

    public HeaderResponse(String des) {
        this.des = des;
    }


    @Override
    public void doPrint() {
        System.out.println("This is a Header");
    }
}
