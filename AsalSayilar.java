package Week2;

import java.util.Scanner;

public class AsalSayilar {
    public static boolean isAsal(int sayi, int bolen) {
        if (bolen == 1) {
            return true; // Bölünmezse asaldır
        }
        if (sayi % bolen == 0) {
            return false; // Bölünüyorsa asal değildir
        }
        return isAsal(sayi, bolen - 1); // Bir önceki böleni kontrol et
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println("Lütfen 1'den büyük bir sayı girin.");
        } else {
            boolean asalMi = isAsal(sayi, sayi-1 ); // Recursive metodu çağır
            if (asalMi) {
                System.out.println(sayi + " bir asal sayıdır.");
            } else {
                System.out.println(sayi + " bir asal sayı değildir.");
            }
        }


    }

}