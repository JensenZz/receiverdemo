package com.example.receiverdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin
 * @date 2019-04-30  11:21
 */
@RestController
@RequestMapping("/v1/report")
public class ReceiverController {


    @GetMapping(value = "/metrics")
    public Integer metricsReport(HttpServletRequest request) {
        return 1;
    }

    @GetMapping(value = "/log")
    public Integer logReport(HttpServletRequest request) {
        return 2;
    }

}
