package org.moon.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mitchell on 2017/3/16.
 */
@Controller
@RequestMapping("/admin")
public class HomeController {

    @RequestMapping(path = { "/","index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("msg","hello world!!!");
        return "index";
    }
}
