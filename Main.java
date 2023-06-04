class Main {
  public static void main(String[] args) {
    int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9};
    int aranacak = 9;
    boolean varmi = sayiBul(sayilar,aranacak);
    mesajVer(varmi, aranacak);
  }

  public static void mesajVer(boolean varMi, int aranacak){
    if(varMi == true){
      System.out.println("dizide var: " + aranacak);
    }
    else{
      System.out.println("dizide yok: " + aranacak);

    }
  }
  public static boolean sayiBul(int[]sayilar1, int aranacak){
    boolean varMi = false;
    for(int sayi: sayilar1){
      if(sayi == aranacak){
        varMi = true;
      }
    }
    return varMi;
  }
}
