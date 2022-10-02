package com.example.greeter;

import com.example.greeter.Greeter;
import org.junit.jupiter.api.Test;
import java.io.System;

public class AppTest{
    @Test
    void sayHello() {
        System.out.println(Greeter.sayHello("Ariasa succes!"));
    }
}
