/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6_aitor;

/**
 *
 * @author Aitor
 */
public class ExpectedValidNameException extends Exception{
    
    private String name;

    public ExpectedValidNameException(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExpectedValidNameException{" + "name=" + name + '}';
    }
    
    
    
    
}
