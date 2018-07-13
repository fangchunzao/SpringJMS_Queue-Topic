package com.fcz.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FangChunZao
 * @Description:
 * @date 2018/7/6
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/message")
    public String Message() {
        return "message";
    }

}
