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
public class NomorDua {
    public static void main(String[] args) {
        String[] namaTeman = new String[5];
        
        namaTeman[0]="Angel babi";
        namaTeman[1]="Maulana";
        namaTeman[2]="Ailsa";
        namaTeman[3]="Ridho";
        namaTeman[4]="Farhan";

        for (int i = 0; i< namaTeman.length; i++){
            System.out.println("nama teman ke-" +(i+1) + ":"+ namaTeman[i]);
        }
    }
}
