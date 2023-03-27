package Minitest.Bai3;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập độ dài của mảng muốn gán");
        int length = Integer.parseInt(scanner.nextLine());
        int list[] = new int[length];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Mời bạn nhập phần tử mảng ");
            int set = Integer.parseInt(scanner.nextLine());
            list[i]=set;
        }
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
