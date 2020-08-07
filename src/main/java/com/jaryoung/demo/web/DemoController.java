package com.jaryoung.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo 接口
 *
 * @author jaryoung
 * @since 2020-08-07 09:06
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello/{word}")
    public String hello(@PathVariable String word) {
        return "Hello " + word + ".";
    }

}
