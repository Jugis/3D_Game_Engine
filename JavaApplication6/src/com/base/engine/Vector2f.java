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
public class Vector2f {
    private float x;
    private float y;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public float dot(Vector2f r) {
        return x * r.getX() + y * r.getY();
    }

    public Vector2f normalize() {
        float length = length();

        x /= length;
        y /= length;

        return this;
    }
   
    //NOW ITS TRICKY!!!
    public Vector2f rotate(float angle) {

        double rad = Math.toRadians(angle);
        double cos = Math.cos(rad);
        double sin = Math.sin(rad);

        return new Vector2f((float)(x * cos - y * sin), (float)(x * sin + y * cos));
    }

    public Vector2f add(Vector2f r) {
        return new Vector2f(x + r.getX(), y + r.getY());
    }

    public Vector2f add(float r) {
        return new Vector2f(x + r, y + r);
    }

    public Vector2f sub(Vector2f r) {
        return new Vector2f(x - r.getX(), y - r.getY());
    }

    public Vector2f sub(float r) {
        return new Vector2f(x - r, y - r);
    }

    public Vector2f mul(Vector2f r) {
        return new Vector2f(x * r.getX(), y * r.getY());
    }

    public Vector2f mul(float r) {
        return new Vector2f(x * r, y * r);
    }
    //DIVIDE HIÁNYZIk
}
