package com.BuilderExemplo;

public class monitorBuilder implements InterfaceMonitorBuilder {

    private String screen;
    private String resolution;
    private String refreshRate;
    private String inputs;

    @Override
    public monitorBuilder screen(String screen) {
        this.screen = screen;
        return this;
    }
    @Override
    public monitorBuilder resolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    @Override
    public monitorBuilder refreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
        return this;
    }
    @Override
    public monitorBuilder inputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    @Override
    public Monitor build() {
        return new Monitor(this);
    }

    public String getScreen() {
        return screen;
    }

    public String getResolution() {
        return resolution;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public String getInputs() {
        return inputs;
    }
}
