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
public class Vertex {
    public static final int SIZE = 3;
    private Vector3f pos;

    public Vertex(Vector3f pos) {
        this.pos = pos;
    }
    public Vector3f getPos() {
        return pos;
    }

    public void setPos(Vector3f pos) {
        this.pos = pos;
    }
}
