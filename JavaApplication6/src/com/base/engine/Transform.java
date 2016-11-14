/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

/**
 *
 * @author VPM
 */
public class Transform {
    private Vector3f translation; //X,Y,Z position of the traslation
    //scale rotation translation
    public Transform(){
        translation = new Vector3f(0,0,0);
    }

    public Matrix4f getTransformation(){
        Matrix4f translationMatrix = new Matrix4f().initTranslatioin(translation.getX(),translation.getY(),translation.getZ());
        
        return translationMatrix;
    }
    
    public Vector3f getTranslation() {
        return translation;
    }

    public void setTranslation(Vector3f translation) {
        this.translation = translation;
    }
    
    public void setTranslation(float x, float y, float z) {
        this.translation = new Vector3f(x, y, z);
    }
}
