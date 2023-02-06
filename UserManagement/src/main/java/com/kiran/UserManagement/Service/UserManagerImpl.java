package com.kiran.UserManagement.Service;

import com.kiran.UserManagement.Model.User;
import com.kiran.UserManagement.ExceptionHandling.UserNotFound;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserManagerImpl implements UserManager{
    List<User> users = new ArrayList<>();
    @Override
    @ResponseBody
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User getUserById(int id) {
        for(User u:users){
            if(u.getUserId()==id){
                return u;
            }
        }
        throw new UserNotFound("No User Found!!!!");
    }

    @Override
    public List<User> getAllUSers() {
        if(users.isEmpty()){
            throw new UserNotFound("No Users Exists in the Database!!!!");
        }
        return users;
    }

    @Override
    public String updateUserInfo(int id, User user) {
        int flag=0;

        if(users.isEmpty()){
            throw new UserNotFound("No Users Exists in the Database!!!!");
        }
        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            User us = it.next();
            if(us.getUserId()==id){
                us.setUserId(user.getUserId());
                us.setAddress(user.getAddress());
                us.setUserName(user.getUserName());
                us.setName(user.getName());
                us.setPhoneNumber(user.getPhoneNumber());
                flag=1;
            }
        }
        if(flag==0)
            throw new UserNotFound("No User Found with id {"+id+" } found!!!!");
        return "User details with id {"+id+"} has been Updated!!!!";
    }

    @Override
    public String deleteUser(int id) {
        int flag=0;

        if(users.isEmpty()){
            throw new UserNotFound("No Users Exists in the Database!!!!");
        }
        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            User us = it.next();
            if(us.getUserId()==id){
                users.remove(us);
                flag=1;
                break;
            }
        }
        if(flag==0)
            throw new UserNotFound("No User Found with id {"+id+" } found!!!!");
        return "User details with id {"+id+"} has been Deleted!!!!";
    }
}
