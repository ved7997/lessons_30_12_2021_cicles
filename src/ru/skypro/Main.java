package ru.skypro;

public class Main {

    public static void main(String[] args) {

        task_1();
        task_2();
        task_3();
    }
    public static void task_1() {

        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");

        }
        System.out.println(" ");

       for (int j = 10;j > 0;j = j - 1 ) {

            System.out.print(j + " ");

        }
        System.out.println();

    }
    public static void task_2(){
        int firstFriday = 3;
        for (int i = firstFriday;i <=31;i = i + 7) {

            System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет.");


        }
        System.out.println();
    }
    public static void task_3(){
        int year = 2022;

        int year_1 = (year - 200);
        int year_2 = (year + 100);
        while (year_1 < year_2){
            year_1++;
            if (year_1 % 79 == 0) {
                System.out.println(year_1);
            }
        }
    }

}
