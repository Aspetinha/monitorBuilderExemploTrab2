package com.BuilderExemplo;

public interface InterfaceMonitorBuilder {
    monitorBuilder screen(String screen);
    monitorBuilder resolution(String resolution);
    monitorBuilder refreshRate(String refreshRate);
    monitorBuilder inputs(String inputs);
    Monitor build();
}
