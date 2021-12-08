package com.lesson.first.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPILesson {
    public static void main(String[] args){
        List<DataItem> itemList=List.of(
                new DataItem("staff1","name1"),
                new DataItem("staff3","name3")
        );
        itemList=new ArrayList<>(itemList);
        itemList.add(null);
        itemList.forEach(System.out::println); //预测输出1
        List<String> staffIDList= itemList.stream().map(dataItem -> {
//补充代码1
        }).collect(Collectors.toList());
        System.out.println(staffIDList);
    }
}