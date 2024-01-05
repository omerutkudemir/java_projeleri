public class Calisanlar {

    String isim;
    int saat;

    float saatUcreti;
    public Calisanlar(String genelMudur, int saat, int saatUcreti)
    {
        isim=genelMudur;
        this.saat=saat;
        this.saatUcreti=saatUcreti;


    }
    public double maasHesapla()
    {
        return saat*saatUcreti;

    }
    public String Isım()
    {
        return isim;
    }
}
