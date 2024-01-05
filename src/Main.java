public class Main {

    public static void main(String[] args) {

        Calisanlar c = new Calisanlar("genel mudur", 7,300);
        Mudur m= new Mudur("Mudur",8,250);
        Teknisyen t= new Teknisyen("Teknisyen",8,250);
        Secreter s= new Secreter("Secreter",8,200);

        System.out.println(c.Isım()+": " +c.maasHesapla()*30);
        c=m;
        System.out.println(m.Isım()+": " +c.maasHesapla()*30);
        c=t;
        System.out.println(t.Isım()+": "+c.maasHesapla()*30);
        c=s;
        System.out.println(s.Isım()+": "+ c.maasHesapla()*30);
    }


}