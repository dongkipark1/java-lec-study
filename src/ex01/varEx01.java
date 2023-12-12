package ex01;

public class varEx01 {

    //모든 코드는 main 메서드 내부에 적는다
    public static void main(String[] args) {
       int n1 = 1; // 한 번 저장하고 끝나는 것이 아니라 다른 값도 저장하기 위해 바이트에 저장하지 않는다 (숫자 21억까지 (4byte = 4칸))
       double d1 = 1.5; // 숫자는 21억까지(8byte = 8칸) 이 주소값은 os가 찾아준다
       long big1 = 20000000000L; // 경까지 가능(8byte) L표시를 해주는 것이 좋다 총 20byte 쓰고있음
       boolean b1 = false; // true or false   1bit 여도 1칸을 만들 수 있음 주소를 찾아와야 하기 때문에 false는 실제로 0이 들어간다 true = 1
       char c1 = '가';//문자 하나 저장할 때 씀 한글 1자 영어 1자

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1); // ctrl+d 한줄 복사 붙여넣기
    } //main의 끝 = 자바 프로그램 종료(자바의 생명줄)
}