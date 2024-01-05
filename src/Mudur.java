public class Mudur extends Calisanlar{

    public Mudur(String isim, int saat, int saatUcret) {
        super(isim, saat, saatUcret);
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
