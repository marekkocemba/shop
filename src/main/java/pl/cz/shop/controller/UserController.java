package pl.cz.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.cz.shop.entity.User;
import pl.cz.shop.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/login")
    private String getUserList(HttpServletRequest request, Model model) {

//        String login = request.getParameter("login");
//
//        System.out.println(login);
//        User user = userService.getUserByLogin(login);
//        System.out.println(user.getLogin()+user.getPassword());
//        request.getSession().setAttribute("user",user);
        return "user_list";
    }

}
