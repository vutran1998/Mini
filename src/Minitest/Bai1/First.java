package Minitest.Bai1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số");
        int number=Integer.parseInt(scanner.nextLine());
        int countSNT=0;
        int check=0;
        for (int i=2;i<1000;i++){
            if (countSNT<number){
                for (int j=1;j<=i;j++){
                    if (i%j==0){
                        check++;
                    }
                }
                if (check==2){
                    System.out.println(" số nguyên tố là"+i);
                    countSNT++;
                }
                check=0;
            }
        }
    }
}
