/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5_Aitor;

/**
 *
 * @author aitgal
 */
public class ExpectedNegativeNumber extends Exception {

    private int num;

    ExpectedNegativeNumber(int n) {
        this.num = n;
    }

    @Override
    public String toString() {
        return "ExpectedNumber{" + num + '}';
    }
    
}
