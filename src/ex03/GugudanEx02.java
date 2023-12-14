package ex03;

public class GugudanEx02 {
        public static void main(String[] args) {
            // \t는 탭, \n은 엔터

            for (int k = 2; k <= 9 ; k++){
                System.out.print(k + "단"+ "\t\t\t");
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


