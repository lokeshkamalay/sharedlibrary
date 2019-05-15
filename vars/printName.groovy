#!/usr/bin/groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    def var = com.sq.JustPrint()
    if(config.mode == 'lower' || config.mode == 'Lower'){
        var.lower(config.name)
    }
    else{
        var.upper(config.name)
    }
}  
    