package com.marshall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thomas on 24/06/2017.
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }


}
