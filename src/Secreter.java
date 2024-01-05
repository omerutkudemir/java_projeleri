public class Secreter extends Calisanlar {
    public Secreter(String isim, int saat, int saatUcret) {
        super(isim ,saat,saatUcret);
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
