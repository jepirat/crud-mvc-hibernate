package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;
import web.services.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(value = "/users")
    public String usersController() {
        userService.add(new User());
        return "users";
    }
}
