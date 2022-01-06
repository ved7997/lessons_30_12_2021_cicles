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
            i++;
            System.out.print(i + " ");

        }
        System.out.println(" ");

       for (int j = 10;j > 0;j-- ) {

            System.out.print(j + " ");

        }
        System.out.println();

    }
    public static void task_2(){
        int firstFriday = 3;
        for (int i = firstFriday;i <= 31;i = i + 7) {

            System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет.");


        }
        System.out.println();
    }
    public static void task_3(){
        int year = 2022;

        int firstCheckedYear = (year - 200);
        int  lastCheckedYear = (year + 100);
        while (firstCheckedYear < lastCheckedYear){
            firstCheckedYear++;
            if (firstCheckedYear % 79 == 0) {
                System.out.println(firstCheckedYear);
            }
        }
    }

}
