package com.BuilderExemplo;

public class Main {
    public static void main(String[] args) {
        
    Monitor.builder builder = new Monitor.builder();     

    Monitor monitor = builder.screen();

    }
}