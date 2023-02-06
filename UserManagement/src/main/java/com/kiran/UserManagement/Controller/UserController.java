package com.kiran.UserManagement.Controller;

import com.kiran.UserManagement.Model.User;
import com.kiran.UserManagement.Service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserManager userManager;
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User usercreated = userManager.create(user);
        return new ResponseEntity<>(usercreated, HttpStatus.CREATED);
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") int id){
        User userFetched = userManager.getUserById(id);
        return new ResponseEntity<>(userFetched,HttpStatus.OK);
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> userFetched = userManager.getAllUSers();
        return new ResponseEntity<>(userFetched,HttpStatus.OK);
    }

    @PutMapping("/updateUserInfo/{id}")
    public ResponseEntity<String> updateUserInfo(@PathVariable(value = "id") int id,@RequestBody User user){
        String userFetched = userManager.updateUserInfo(id,user);
        return new ResponseEntity<>(userFetched,HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam int id){
        String userFetched = userManager.deleteUser(id);
        return new ResponseEntity<>(userFetched,HttpStatus.OK);
    }
}
