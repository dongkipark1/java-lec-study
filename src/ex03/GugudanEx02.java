package ex03;

public class GugudanEx02 {
        public static void main(String[] args) {
            // \t는 탭, \n은 엔터

            for (int j = 2; j <= 9 ; j++){
                System.out.print(j + "단"+ "\t\t\t");
            }
                System.out.println();
                for (int i = 1; i <= 9 ; i++) {

                    for (int x = 2; x <= 9 ; x++) {
                        System.out.print(x + "*" + i + "=" + x * i +"\t\t");

                }

                System.out.println();
            }

        }
}


