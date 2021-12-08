package com.example.tohjl.servise;

import com.example.tohjl.model.*;
import com.example.tohjl.entity.*;
import com.example.tohjl.mapper.LoginMapper;
import com.example.tohjl.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserServer {
    @Autowired
    private LoginMapper mMapper;

    @Transactional
    public UserResponse add(addUser model){
        User user = new User();
        user.staff_id = model.staff_id;
        user.staff_type = model.staff_type;
        user.password = model.password;
        User persisted = mMapper.save(user);
        return wrapForResponse(persisted);
    }

    @Transactional
    public String getMima(addUser model){

        User user = mMapper.lookupmimaBystaffID(model.staff_id);
        if(Objects.equals(user.password, model.password)){
            return "登录成功";
        }else{
            return model.password;
        }
    }

    @Transactional
    public List<UserResponse> list(){
        List<User> userList = mMapper.user();
        return wrapListForResponse(userList);
    }

    private UserResponse wrapForResponse(User user) {
        return new UserResponse(user);
    }

    private List<UserResponse> wrapListForResponse(List<User> userList) {
        List<UserResponse> dataList=new ArrayList<>();
        for(User user:userList){
            UserResponse data=wrapForResponse(user);
            dataList.add(data);
        }
        return dataList;
    }






}
