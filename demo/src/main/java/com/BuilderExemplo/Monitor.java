package com.BuilderExemplo;

public class Monitor {

    private String screen;
    private String resolution;
    private String refreshRate;
    private String inputs;
   
   
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


    Monitor(Builder builder){

        this.screen = builder.screen;
        this.resolution = builder.resolution; 
        this.refreshRate = builder.refreshRate;
        this.inputs = builder.inputs;
    }

    
}
