package com.renyr.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springboot-demo
 * @description:
 * @author: ryr
 * @Date: 2019-07-11 14:04
 */
@Controller
@RequestMapping("demo")
public class DemoController {

    @GetMapping("index")
    public String index() {
        return "index";
    }

}
