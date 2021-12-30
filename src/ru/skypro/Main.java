package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //pervoe_DZ();
        //vtoroe_DZ();
        trete_DZ();
    }
    public static void pervoe_DZ() {

        int j = 1;
        for (int i = 0; i < 10; i++) {

            System.out.print(j + " ");
            j = j + 1;
        }
        System.out.println(" ");
        int jj = 10;
        for (int i = 10; i > 0; i--) {

            System.out.print(jj + " ");
            jj = jj - 1;
        }

    }
    public static void vtoroe_DZ(){
        int pytnyca = 3;
        for (int i = 0;i <=31;i = i + 7) {

            System.out.println("Сегодня пятница, " + pytnyca + " -е число. Необходимо подготовить отчет.");
            pytnyca = pytnyca + 7;
        }
    }
    public static void trete_DZ(){
        int god = (2017 + 79)- 200;
        for (int i = god;i <=2100;i = i + 79){
            System.out.println(i + "г");
        }
    }

}
