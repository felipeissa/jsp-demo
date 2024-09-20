package com.example.jsp_demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public ResponseEntity<Object> hello() {

        return new ResponseEntity<>("Hello word", HttpStatus.OK);
    }

    @RequestMapping("/file.jsp")
    public ResponseEntity<Object> file() {

        return new ResponseEntity<>("should return this", HttpStatus.OK);
    }
}
