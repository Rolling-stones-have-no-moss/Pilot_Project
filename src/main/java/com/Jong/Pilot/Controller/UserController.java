package com.Jong.Pilot.Controller;

import com.Jong.Pilot.Entity.User;
import com.Jong.Pilot.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String userPage(Model model){
        List<User> ListEveryUser =  userService.findEveryUser();
        model.addAttribute("ListEveryUser",ListEveryUser);

        return "UserPage";
    }


}
