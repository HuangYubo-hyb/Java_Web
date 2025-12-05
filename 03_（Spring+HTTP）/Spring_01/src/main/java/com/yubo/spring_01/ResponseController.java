package com.yubo.spring_01;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {


    @RequestMapping("/response")
    public ResponseEntity<String> response() {
        return ResponseEntity
                .status(401)
                .header("name", "yubo")
                .body("<h1>hello world</h1>");
    }
}
