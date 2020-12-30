package com.meishuosoft.springboothelloworlddemo.Controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Meishuosoft
 */
@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String index(){
        return  "hello,I'm meishuosoft,这是我的第一个springboot demo";
    }
}
