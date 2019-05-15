#!/usr/bin/groovy
package com.sq

def maven(mavenvar){
  try{
    sh "echo ${mavenvar}"
  }catch(err) {
    echo "Resulted in error"
    println err.toString()
  }
}  
    
