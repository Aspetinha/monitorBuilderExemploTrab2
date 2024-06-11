package com.BuilderExemplo;

public class Builder {

    private String screen;
    private String resolution;
    private String refreshRate;
    private String inputs;
    
    
    public Builder screen(String screen){
        this.screen = screen;
        return this;
    }

    public Builder resolution(String resolution){
        this.resolution = resolution;
        return this;
    }

    public Builder refreshRate(String refreshRate){
        this.refreshRate = refreshRate;
        return this;
    }

    public Builder inputs(String inputs){
        this.inputs = inputs;
        return this;
    }


    public Monitor build(){
        return new Monitor(this);
    }



}


