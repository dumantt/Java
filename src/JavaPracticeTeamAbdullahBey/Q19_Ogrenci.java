package JavaPracticeTeamAbdullahBey;

public class Q19_Ogrenci extends Q19_Kisi {
    //Ad-Soyad,  kimlik No, yaş, numara, sınıf

    private int numara;
    private String sinif;

    public Q19_Ogrenci(String ad, String sad, String tcNo, int yas, int numara, String sinif) {
        super(ad, sad, tcNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }
    public Q19_Ogrenci() {
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "numara=" + numara +
                ", sinif='" + sinif;
    }
}
