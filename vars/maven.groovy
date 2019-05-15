#!/usr/bin/groovy

def call(Map config) {
    
    def var = new com.sq.MyMaven()
    
    def maven = "mvn"
    if (config.clean == 'true'){
      maven = maven + ' clean'
    maven = maven + ' ' + config.goal
    if (config.sonar == 'true){
      maven = maven + ' sonar:sonar '
    var.maven(maven)
}  
    
