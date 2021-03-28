package com.company;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AK47 ak47 = new AK47();//membuat objek dari kelas AK47
        Bazhoka bazhoka = new Bazhoka();//membuat objek dari kelas Bazhoka
        Rambo rambo = new Rambo();//membuat objek dari kelas Rambo
        Pistol pistol = new Pistol();//membuat objek dari kelas Pistol

        //pollymorphysm//
        rambo.setSenjata(ak47);//rambo diberi senjata ak47
        rambo.Menembak();// dan rambo menembak
        rambo.setSenjata(bazhoka);//rambo diberi senjata bazoka
        rambo.Menembak();//dan rambo menembak
        rambo.setSenjata(pistol);//rambo saya kasih senjata pistol
        rambo.Menembak();//dan rambo menembak
    }

}