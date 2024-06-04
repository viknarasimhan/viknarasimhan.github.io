package dev.io.vik.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class HomeController {

    private static Logger logger =  LoggerFactory.getLogger(HomeController.class);
    @GetMapping({"/", "/home"})
    public String home() {
        logger.info("this is a new log");
        return "home";
    }
}
