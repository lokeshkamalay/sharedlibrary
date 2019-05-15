#!/usr/bin/groovy
package com.sq

def maven(maven){
  try{
    sh "${maven}"
  }catch(err) {
    echo "Resulted in error"
    println err.toString()
  }
}  
    
