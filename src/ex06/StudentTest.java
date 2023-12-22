package ex06;

class Person01 {
    private String regnumer; //주민등록증, 자식 클래스에서 접근 불가
    private double weight; //체중, 자식 클래스에서 접근 불가
    protected int age; //나이, 자식 클래스에서 접근 가능
    String name; // 이름, 어디서나 접근 가능

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Student extends Person01 {
    int id;             // 학번
}

public class StudentTest {
    public static void main(String[] args) {
        Student obj = new Student();
        //obj.regnumber = "123456 - 123456"; //오류(접근 불가)
        //obj.weight = 75.0; //오류(접근 불가)
        obj.age = 21;
        obj.name = "Kim";
        obj.setWeight(75.0);

        System.out.println("나이는: " + obj.age);
        System.out.println("이름은: " + obj.name);
        System.out.println("몸무게는: " + obj.getWeight());
    }

}
