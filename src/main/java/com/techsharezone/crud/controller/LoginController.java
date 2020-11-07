package com.techsharezone.crud.controller;


/*
 * @created 07/11/2020 -00:56
 * @project This-spring-boot-login-aws-rds-jpa
 * @author  saurabhshcs
 */

import com.techsharezone.crud.exception.UserException;
import com.techsharezone.crud.model.User;
import com.techsharezone.crud.model.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.ACCEPTED;


@RestController
public class LoginController {

    @Autowired
    private UserRepositoty userRepositoty;

    @PostMapping(value = "/login")
    public ResponseEntity<String> login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        User user;

        try {
            user = userRepositoty.findByName(userName);
        } catch (UserException exception) {
            exception.getMessage();
        }
        return new ResponseEntity("Login Successfully", ACCEPTED);
    }

}
