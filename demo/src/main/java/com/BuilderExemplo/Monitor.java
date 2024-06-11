package com.BuilderExemplo;

public class Monitor {

    private String screen;
    private String resolution;
    private String refreshRate;
    private String inputs;
   
    // getter / setters
    public String getScreen() {
        return screen;
    }
    public void setScreen(String screen) {
        this.screen = screen;
    }
    public String getResolution() {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public String getRefreshRate() {
        return refreshRate;
    }
    public void setRefreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
    }
    public String getInputs() {
        return inputs;
    }
    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    public Monitor(monitorBuilder builder) {
        this.screen = builder.getScreen();
        this.resolution = builder.getResolution();
        this.refreshRate = builder.getRefreshRate();
        this.inputs = builder.getInputs();
    }

    @Override
    public String toString() {
        return "Monitor [Screen=" + screen + ", Resolution=" + resolution + ", Refresh Rate=" + refreshRate + ", Inputs=" + inputs + "]";
    }

    
}
