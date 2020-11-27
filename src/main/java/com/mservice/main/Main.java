package com.mservice.main;

import com.mservice.verticle.MainVerticle;

public class Main {

    public static void main(String[] args) {
        Runner.runJava(MainVerticle.class);
    }

}
