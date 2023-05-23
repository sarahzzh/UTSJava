/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts;

/**
 *
 * @author C-15
 */
public class NomorSatu {
    public static void main(String[] args) {
        int[] array = new int[10];
        
        array[0] = 5;
        array[1] = 10;
        array[2] = 15;
        array[3] = 20;
        array[4] = 25;
        array[5] = 30;
        array[6] = 35;
        array[7] = 40;
        array[8] = 45;
        array[9] = 50;
        
        for (int i = 0; i< array.length;i++){
            System.out.println("Nilai Array ke - " + i + ":" + array[i]);
        }
    }
}
