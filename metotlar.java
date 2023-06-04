class metotlar {
  public static void main(final String[] args) {
    // metotları biz farklı DRY - do not repeat yourself mantığına uymamak için
    // kullanırız.
    // buna örnek olarak ben 100 sayfada da açılışta hoşgeldiniz @kullanıcı
    // bastırmak istiyorum. Bunun için alt alta her sayfada
    // system.print.outln("hoşgeldiniz",@kullanıcı) yapmak yerine bir tane metot
    // oluştururum ve her sayfada o metotu çağırırım. bu hem clean code mantığına
    // uyar kod kalabalığından kurtuluruz hem de kendimiz kod tekrarına düşmemiş
    // oluruz.
    // bir de bizden daha sonra bu yaptığımız kod üzerinde değişiklik isteyebilirler
    // gidip ayrı ayrı her kodu değiştirmek yerine sadece metot üzerinde değişiklik
    // yapmak daha hızlı ve kolay olacaktır.

    // NOT: javada fonksiyon veya metot isimleri camelCase yazılmaktadır. C# daPascalCase şeklinde yazılmaktadır.

    //bir metot yalnızca bir işlem için yapılır. Void ile return fonk. arasındaki farkı anlatırken şundan bahsedildi. iki sayının toplamını void topla metotu ile ekrana bastırabilriz ama ben bu iki sayının yüzde 10'unu bulmak istersem gidip topla fonk. içinde buldurtamam clean code'a uymayacaktır yalnızca bir metot bir iş ile görevlidir. ayrı bir void yüzdebul şeklinde fonk. yazıp orada yukarıdaki fonk. çağıramayız çünkü void fonk. sadece çağırıldığında ekrana basar ama return fonk. değer döndürür o değeri diğer fonk. içinde de kullanabiliriz.
    //return fonk genellikle hesaplamalarda kullanılan bir metot türüdür.
    //fonksiyonlar sadece int veya string değer döndürmez. Listelerde döndürür.
      mesajVer("Engin");
   hesapla();
   System.out.println(topla(6,3));

   System.out.println(toplananIkiSayininYuzdeOnu(10,90));
   
  }
   public static void mesajVer(String isim){
    System.out.println("Merhaba "+isim);
    //10larca satır olduğunu düşün
  }
  public static void hesapla(){
    System.out.println("Hesaplandı");
    //10larca satır olduğunu düşün
  }

  public static int topla(int sayi1, int sayi2){
     int toplam = sayi1 + sayi2;
     return toplam;
  }

  //toplanan iki sayinin %10 unu bul
  public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2){
     int toplam = topla(sayi1,sayi2);
     double sonuc = toplam * 10/100;
     return sonuc;
  }

  public static double krediHesapla(double krediMiktari){
      //hesaplar yapılır
      return 125000;
  }


  //DRY - Do not Repeat Yourself
}
