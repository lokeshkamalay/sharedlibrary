#!/usr/bin/groovy

def call(Map config) {
    
    def var = new com.sq.MyMaven()
    
    def mavenvar = "mvn"
    if (config.clean == 'true'){
      mavenvar = mavenvar + ' clean'
    }
    mavenvar = mavenvar + ' ' + config.goal
    if (config.sonar == 'true'){
      mavenvar = mavenvar + ' sonar:sonar '
    var.maven(mavenvar)
    }
}  
    
