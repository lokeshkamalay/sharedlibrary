#!/usr/bin/groovy
package com.sq
def lower(name){
    try{
       timeout(time:5){
            println(name.toString().toLowerCase());
        }
    }catch(err){
        println err.toString()
        echo "Failed to print the name, pls retry!"
    }
}

def upper(name){
    try{
        timeout(time:5){
            println(name.toUpperCase());
        }
    }catch(err){
        echo "Failed to print the name, pls retry!"
    }
}
