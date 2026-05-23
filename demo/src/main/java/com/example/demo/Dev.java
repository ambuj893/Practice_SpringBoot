package com.example.demo;

import org.springframework.stereotype.Component;

// By this Spring understands it has to inject this object
@Component
public class Dev {
    public void build(){
        System.out.println("Hello I am a Developer");
    }
}
