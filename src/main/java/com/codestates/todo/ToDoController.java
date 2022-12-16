package com.codestates.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ToDoController {

    @GetMapping("/")
    public String toDoApplicationShow(){
        return "To-do Application !";
    }
}
