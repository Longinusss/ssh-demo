package com.lon.action;
import com.opensymphony.xwork2.ActionSupport;
import com.lon.model.UserEntity;
import com.lon.service.UserService;

public class TestAction extends ActionSupport {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String test(){
        UserEntity userEntity = userService.getUser(1);
        System.out.println("id为1的用户名字为"+userEntity.getName());
        return "test";
    }

}