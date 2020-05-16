package com.raymond.mobileappws.controller;

import com.raymond.mobileappws.model.UserInfoRequestModel;
import com.raymond.mobileappws.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserModel> getUser(){
        UserModel res = new UserModel("Raymond", "Shan", "raymond@gmail.com", "password");

        return new ResponseEntity<UserModel>(res,HttpStatus.OK);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserModel> createUser(@RequestBody UserInfoRequestModel userInfo){
        UserModel res = new UserModel("Raymond", "Shan", "raymond.shan@gmail.com", "password");

        return new ResponseEntity<UserModel>(res,HttpStatus.OK);
    }

}
