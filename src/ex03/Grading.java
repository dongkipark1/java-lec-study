package ex03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        double grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하시오: ");
        grade = sc.nextDouble();
        if (grade >= 95){
            System.out.println("학점 A+");
        } else if (grade >= 90){
            System.out.println("학점 A0");
        } else if (grade >= 80) {
            System.out.println("학점 B");
        } else if (grade >= 70) {
            System.out.println("학점 C");
        } else if (grade >= 60) {
            System.out.println("학점 D");
        }else{
            System.out.println("학점 F");
        }
    }
}
