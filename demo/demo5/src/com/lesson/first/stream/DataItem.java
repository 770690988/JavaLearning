package com.lesson.first.stream;

public class DataItem {
    public String staffID;
    public String name;
    public DataItem(String staffID,String name) {
        this.staffID = staffID;
        this.name = name;
    }
    @Override
    public String toString() {
        return "DataItem{" +
                "staffID='" + staffID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}