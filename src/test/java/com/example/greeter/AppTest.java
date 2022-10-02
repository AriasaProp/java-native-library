package com.example.greeter;

import com.example.greeter.Greeter;
import org.junit.jupiter.api.Test;
import java.lang.System;

public class AppTest{
    @Test
    void sayHello() {
        System.out.println("Hello World!");
        System.out.println(new Greeter().sayHello("Ariasa succes!"));
    }
}
