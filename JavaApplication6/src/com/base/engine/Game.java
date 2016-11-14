/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import org.lwjgl.input.Keyboard;

/**
 *
 * @author Pali
 */
public class Game {

    private Mesh mesh;
    private Shader shader;

    public Game() {
        mesh = new Mesh();
        shader = new Shader();

        Vertex[] data = new Vertex[]{new Vertex(new Vector3f(-1, -1, 0)),
            new Vertex(new Vector3f(-1, 1, 0)),
            new Vertex(new Vector3f(0, 1, 0))};

        mesh.AddVertices(data);

        shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vs"));
        shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.fs"));
        shader.compileShader();

        shader.addUniform("uniformFloat");
    }

    public void input() {
        if (Input.getKeyDown(Keyboard.KEY_UP)) {
            System.out.println("we just pressed up");
        }
        if (Input.getKeyUp(Keyboard.KEY_UP)) {
            System.out.println("we just released up");
        }
        if (Input.getMouseDown(0)) {
            System.out.println("we just rightlickced at: " + Input.getMousePosition().toString());
        }
        if (Input.getMouseUp(0)) {
            System.out.println("we just released at: " + Input.getMousePosition().toString());
        }
    }

    float temp = 0.0f;
    
    public void update() {
        temp+= Time.getDelta();
        
        shader.setUniformf("uniformFloat", (float) Math.abs(Math.sin(temp)));
    }

    public void render() {

        shader.bind();
        mesh.draw();
    }
}
