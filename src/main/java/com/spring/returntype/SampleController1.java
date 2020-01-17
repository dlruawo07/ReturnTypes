package com.spring.returntype;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/ex01")
public class SampleController1 {
    private static final Logger logger = LoggerFactory.getLogger(SampleController1.class);
    
    @RequestMapping("/doA")
    public void doA(){
        logger.info("doA ����..........");
    }
    
    @RequestMapping("/doB")
    public void doB(){
        logger.info("doB ����..........");
    }    
}