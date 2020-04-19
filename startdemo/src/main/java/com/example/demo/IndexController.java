package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by 8615209847041 on 2020/4/19.
 */
@Controller
public class IndexController {
    @RequestMapping("index")
    @ResponseBody
    public String index (){
        return "Hello IdeA springBoot";
    }
}
