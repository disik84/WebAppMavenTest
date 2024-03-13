package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.UserDao;
import web.model.User;

@Controller
public class UserController {

    UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping(value = "/")
    public String showIndexPage(ModelMap model) {
        User user1 = new User("Denis", "Belov", (byte) 33);
        userDao.addUser(user1);
        return "index";
    }
}
