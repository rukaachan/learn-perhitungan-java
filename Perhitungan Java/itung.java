import java.util.*;

public class itung {
    public static void main(String args[]){
      
      Scanner inputUser = new Scanner(System.in);
      int nilai = 0;
      int result = 0;
      String ulang = "Y";
      while(ulang.equals("Y"))
    { 
      System.out.println("Masukkan nilai nya : " );
      nilai = inputUser.nextInt();

      Scanner loop = new Scanner(System.in);
      System.out.println("Ingin menambahkan lagi? (Y/T) ?");
      ulang = loop.nextLine().toUpperCase();
      result = result + nilai;
      }
      System.out.println("Total yang anda masukan " + result);
  }
}
