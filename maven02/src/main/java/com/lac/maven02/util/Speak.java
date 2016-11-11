package com.lac.maven02.util;

import com.lac.model.HelloWorld;

public class Speak{
    public String sayHi(){
        return new HelloWorld().sayHello();
    }
}