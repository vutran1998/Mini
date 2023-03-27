package Minitest.Bai2;

public class Second {
    public static void main(String[] args) {
        int list[] = {1, 6, 8, 3, 9, 4, 7, 11, 17, 15};
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        System.out.println(total);
        System.out.println("Số lớn nhất trong mảng là");
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max){
                max=list[i];
            }

        }
        System.out.println(max);
    }
}
