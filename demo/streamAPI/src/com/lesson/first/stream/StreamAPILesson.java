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
        /*
          DataItem{staffID='staff1', name='name1'}
          DataItem{staffID='staff3', name='name3'}
          null
        */
        List<String> staffIDList= itemList.stream().map(dataItem -> {
            Optional<DataItem> ID = Optional.ofNullable(dataItem);
            DataItem m = ID.orElse(new DataItem("defaultStaffID","defaultName"));
            return String.valueOf(m.staffID);
        }).collect(Collectors.toList());
        System.out.println(staffIDList);
    }
}
