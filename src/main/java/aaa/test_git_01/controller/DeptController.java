package aaa.test_git_01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeptController {
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return "hello world";
    }
}
