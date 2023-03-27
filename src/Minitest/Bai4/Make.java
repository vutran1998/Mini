package Minitest.Bai4;

import java.util.Scanner;

public class Make {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập đối tượng");
        System.out.println("Mời bạn nhập tên");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên lớp ");
        String classname = scanner.nextLine();
        Student student = new Student(name,age,classname);
        System.out.println(student);

    }
}
