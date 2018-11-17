package com.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(value = "/crypt", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> cryptString(@RequestParam("string") String string){
        Map<String, Object> map = new HashMap<>();

        int number = 0;

        for(int i = 0; i < 10000; i++){
            number += string.hashCode();
            number %= 100000000;
        }

        map.put("response", number);
        map.put("status", HttpStatus.ACCEPTED);

        return map;
    }

}
