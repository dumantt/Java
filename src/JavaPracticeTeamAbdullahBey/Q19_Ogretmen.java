package JavaPracticeTeamAbdullahBey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q19_Ogretmen extends Q19_Kisi {
    //Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No
    private String bolum;
    private int sicilNo;

    public Q19_Ogretmen() {
    }

    public Q19_Ogretmen(String ad, String sad, String tcNo, int yas, String bolum, int sicilNo) {
        super(ad, sad, tcNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString()+" " + "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo;
    }
}
