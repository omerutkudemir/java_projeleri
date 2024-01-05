public class Teknisyen extends Calisanlar{
    public Teknisyen(String isim, int saat, int saatUcret)
    {
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
