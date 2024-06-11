package com.BuilderExemplo;

public class Main {
    public static void main(String[] args) {
        
        monitorBuilder builder = new monitorBuilder();
        Monitor monitor = builder
                            .screen("27 inch LED")
                            .resolution("2560x1440")
                            .refreshRate("144Hz")
                            .inputs("HDMI, DisplayPort")
                            .build();
        System.out.println(monitor);

        // criando novo tipo de monitor;

        monitorBuilder monitorzinho = new monitorBuilder();

        Monitor MonitorBenq = monitorzinho.screen("HD PAPAI").build(); 

        System.out.println(MonitorBenq);

    }
}