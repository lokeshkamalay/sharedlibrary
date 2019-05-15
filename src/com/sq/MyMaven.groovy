#!/usr/bin/groovy
package com.sq

def maven(mavenvar){
  try{
    sh "echo hi"
    sh "${mavenvar}"
  }catch(err) {
    echo "Resulted in error"
    println err.toString()
  }
}  
    
