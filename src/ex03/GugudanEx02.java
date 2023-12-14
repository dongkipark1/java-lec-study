package ex03;

public class GugudanEx02 {
        public static void main(String[] args) {
            // \t는 탭, \n은 엔터

            for (int i = 2; i <= 9 ; i++){
                System.out.print(i + "단"+ "\t\t\t");
            }
                System.out.println();
                for (int j = 1; j <= 9 ; j++) {

                    for (int x = 2; x <= 9 ; x++) {
                        System.out.print(x + "*" + j + "=" + x * j +"\t\t");

                }

                System.out.println();
            }

        }
}


