package ru.skypro;

public class Main {

    public static void main(String[] args) {

        pervoe_task();
        vtoroe_task();
        trete_task();
    }
    public static void pervoe_task() {

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
        System.out.println();
        System.out.println();
    }
    public static void vtoroe_task(){
        int pytnyca = 3;
        for (int i = 0;i <=31;i = i + 7) {

            System.out.println("Сегодня пятница, " + pytnyca + " -е число. Необходимо подготовить отчет.");
            pytnyca = pytnyca + 7;

        }
        System.out.println();
    }
    public static void trete_task(){
        int god = (2017 + 79)- 200;
        for (int i = god;i <=2100;i = i + 79){
            System.out.println(i + "г");
        }
    }

}
