package com.example.tohjl.model;

import com.example.tohjl.entity.*;

public class UserResponse {
    public String staff_id;
    public String staff_type;
    public String password;

    public UserResponse(User user){
        this.password = user.password;
        this.staff_type = user.staff_type;
        this.staff_id = user.staff_id;
    }


}
