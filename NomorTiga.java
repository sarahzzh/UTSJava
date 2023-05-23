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
public class NomorTiga {

    private String nama;
    private String nim;
    private String alamat;
    private int umur;
    private double tinggiBadan;

    public NomorTiga(String nama, String nim, String alamat, int umur, double tinggiBadan) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    public static void main(String[] args) {
        NomorTiga dataDiri = new NomorTiga("Sarah Azizah", "22201087", "batu", 20, 165);

        System.out.println("Data Diri:");
        System.out.println("Nama: " + dataDiri.getNama());
        System.out.println("NIM: " + dataDiri.getNIM());
        System.out.println("Alamat: " + dataDiri.getAlamat());
        System.out.println("Umur: " + dataDiri.getUmur());
        System.out.println("Tinggi Badan: " + dataDiri.getTinggiBadan() + " cm");
    }
}



