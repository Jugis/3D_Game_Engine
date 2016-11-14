#version 330

layout (loaction = 0) in vec3 position;

out vec4 color;

void main(){
    color = vec(clamp(position, 0.0. 1.0), 1.0);
    gl_Position = vec(0.25 * position, 1.0);
    
}
