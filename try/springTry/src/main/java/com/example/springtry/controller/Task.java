package com.example.springtry.controller;

public class Task {
    public String name;
    public String hour;

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", hour='" + hour + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
