package com.techathon.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value = "/crypt", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> cryptString(@RequestParam("string") String string){
        Map<String, Object> map = new HashMap<>();

        int number = 0;

        for(int i = 0; i < 100000; i++){
            number += string.hashCode();
            number %= 100000000;
            for(int j = 0; j < 100000; j++){
                number += string.hashCode();
                number %= 100000000;
//                for(int k = 0; k < 1000000000; k++){
//                    number += string.hashCode();
//                    number %= 100000000;
//                }
            }
        }

        map.put("response", number);
        map.put("status", HttpStatus.ACCEPTED);

        return map;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> mainRequest(){
        Map<String, Object> map = new HashMap<>();
        map.put("status", HttpStatus.ACCEPTED);

        return map;
    }

}
