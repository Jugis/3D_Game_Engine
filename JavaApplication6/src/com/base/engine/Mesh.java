/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;


import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL20.*;
/**
 *
 * @author Pali
 */
public class Mesh {
    private int vbo;
    private int size;
    
    public Mesh(){
        vbo = glGenBuffers();
        size = 0;
    }
    
    public void AddVertices(Vertex[] vertices){
        size = vertices.length;
        
        glBindBuffer(GL_ARRAY_BUFFER, vbo);
        glBufferData(GL_ARRAY_BUFFER, Util.createFlippedBuffer(vertices), GL_STATIC_DRAW);
    }
    
    public void draw(){
        glEnableVertexAttribArray(0);
        //Vertex size is the number of floating points in a vertex, 
        //és szorozzuk 4-el, mert mindegyik szarság 4 byte-ból áll
         glBindBuffer(GL_ARRAY_BUFFER, vbo);
         glVertexAttribPointer(0, 3, GL_FLOAT, false, Vertex.SIZE * 4, 0);
         
         glDrawArrays(GL_TRIANGLES, 0, size);
         
         glDisableVertexAttribArray(0);
    }
}
