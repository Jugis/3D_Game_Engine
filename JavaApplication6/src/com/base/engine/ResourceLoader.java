/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Pali
 */
public class ResourceLoader {

    public static String loadShader(String fileName) {
        StringBuilder shaderSource = new StringBuilder();
        BufferedReader shaderReader;
        try {
            shaderReader = new BufferedReader(new FileReader("./res/shaders" + fileName));
            String line;
            while ((line = shaderReader.readLine()) != null) {
                shaderSource.append(line).append("\n");
            }

            shaderReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return shaderSource.toString();
    }
}
