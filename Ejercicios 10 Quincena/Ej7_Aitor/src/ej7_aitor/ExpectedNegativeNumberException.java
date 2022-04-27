/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7_aitor;

/**
 *
 * @author Aitor
 */
public class ExpectedNegativeNumberException extends Exception {

    private int num;

    ExpectedNegativeNumberException(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ExpectedNegativeNumberException{" + "num=" + num + '}';
    }

    
    
}
