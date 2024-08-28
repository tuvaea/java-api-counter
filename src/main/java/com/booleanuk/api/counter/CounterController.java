package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
public class CounterController {
    private int number;

    public CounterController(){
        this.number=0;
    }

    @GetMapping
    public int getNumber() {
        return number;
    }

    @GetMapping("/increment")
    public int increment(){
        number++;
        return number;
    }

    @GetMapping("/decrement")
    public int decrement(){
        number--;
        return number;
    }
}
