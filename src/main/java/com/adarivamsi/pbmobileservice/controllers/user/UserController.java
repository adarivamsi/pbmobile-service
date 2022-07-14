package com.adarivamsi.pbmobileservice.controllers.user;

import com.adarivamsi.pbmobileservice.models.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 7/14/2022
 */
@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return List.of(new User("USER007", "Vamsi Charan Adari"));
    }
}
