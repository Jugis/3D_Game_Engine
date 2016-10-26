/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

/**
 *
 * @author Pali
 */
public class Time {
    public static final long SECOND = 1000000000L;
    private static double delta;
    
    public static long getTime(){
        return System.nanoTime();
    }
    
    public static double getDelta(){
        //amount of time passes between frames
        return delta;
    }
    
    public static void setDelta(double delta){
        Time.delta = delta;
    }
}
