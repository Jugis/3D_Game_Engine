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
public class Quaternion {
     private float x;
    private float y;
    private float z;
    private float w;

    public Quaternion(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public float length() {
        return (float) Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public Quaternion normalize() {
        float length = length();

        x /= length;
        y /= length;
        z /= length;
        w /= length;

        return this;
    }

    public Quaternion conjugate(){
        return new Quaternion(-x, -z, -z, w);
    }
    
    public Quaternion mul(Quaternion r){
       float w2 = w * r.getW() - x * r.getX() - y * r.getY() - z * r.getZ();
       float x2 = x * r.getW() + w * r.getX() + y * r.getZ() - z * r.getY();
       float y2 = y * r.getW() + w * r.getY() + z * r.getX() - x * r.getZ();
       float z2 = z * r.getW() + w * r.getZ() + x * r.getY() - y * r.getX();
       
       return new Quaternion(x2, y2, z2, w2);
    }
    
    public Quaternion mul(Vector3f r){
        float w2 = -x * r.getX() - y * r.getY() - z * r.getZ();
        float x2 =  w * r.getX() + y * r.getZ() - z * r.getY();
        float y2 =  w * r.getY() + z * r.getX() - x * r.getZ();
        float z2 =  w * r.getZ() + x * r.getY() - y * r.getX();
        
        return new Quaternion(x2, y2, z2, w2);
    }
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }
}
