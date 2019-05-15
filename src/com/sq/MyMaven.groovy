#!/usr/bin/groovy
package com.sq

def maven(maven){
  try{
    echo "Inside shared library"
    sh "${maven}"
  }catch(err) {
    echo "Resulted in error"
    println err.toString()
  }
}  
    
