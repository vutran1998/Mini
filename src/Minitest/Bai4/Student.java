package Minitest.Bai4;

public class Student {
    String name;
    int age;
    String classname;

    public Student(String name, int age, String classname) {
        this.name = name;
        this.age = age;
        this.classname = classname;
    }
    public Student(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                ", classname='" + classname + '\'' +
                '}';
    }

}
