package com.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/v1")
public class controller {

    @PostMapping("")
    public ResponseEntity<String> createTask() {
        return new ResponseEntity<>("Task Created...", HttpStatus.CREATED);
    }

}