#!/usr/bin/groovy

def call(Map config) {
    def var = new com.sq.JustPrint()
    if(config.mode == 'lower' || config.mode == 'Lower'){
        var.lower(config.name)
    }
    else{
        var.upper(config.name)
    }
}  
    
