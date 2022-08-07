public class Main {
    public static void main(String[] args) {
        // Задание 1 \\
       /* int clientOS = 1;
       if (clientOS == 0){
           System.out.println("Установите версию приложения для iOS по ссылке");
       }
       if (clientOS == 1){
           System.out.println("Установите версию приложения для Android по ссылке");
       } */
        // Задание 2 \\
       /* int clientDeviceYear = 2011;
       if (clientDeviceYear <= 2015 && clientOS == 1 ){
           System.out.println( "Установите облегченную версию приложения для Android по ссылке");
       }
       else if ( clientDeviceYear > 2015 && clientOS == 1 ) {
           System.out.println("Установите версию приложения для Android по ссылке");
       }
       else if ( clientDeviceYear <= 2015 && clientOS == 0){
           System.out.println("Установите облегченную версию приложения для iOS по ссылке");
       }
       else if ( clientDeviceYear > 2015 && clientOS == 0){
           System.out.println("Установите версию приложения для iOS по ссылке");
       }

       // Задание 3 \\
        int year = 2020;
       if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
           System.out.println( year + " год является високосным");
       }
       else {
           System.out.println(year + " год не является високосным");
       }

       // Задание 4 \\
        int deliveryDistance = 95;
       int deliveryDays = 1;
       int differenceDays = 40;
       int startLimit = 20;
       if ( deliveryDistance <= 20){
           System.out.println("Потребуется дней:" + deliveryDays);
       }
       else if (deliveryDistance > 20 && deliveryDistance <=59){
           deliveryDays = deliveryDays + 1;
           System.out.println("Потребуется дней:" + deliveryDays);
       }
       else if (deliveryDistance > 59){
           deliveryDays = (deliveryDistance + startLimit) / differenceDays + 1;
           System.out.println("Потребуется дней:" + deliveryDays);
       }

       // Задание 5 \\
        int monthNumber = 14;
       switch (monthNumber) {
           case 1:
               System.out.println("Зима");
               break;
           case 2:
               System.out.println("Зима");
               break;
           case 3:
               System.out.println("Весна");
               break;
           case 4:
               System.out.println("Весна");
               break;
           case 5:
               System.out.println("Весна");
               break;
           case 6:
               System.out.println("Лето");
               break;
           case 7:
               System.out.println("Лето");
               break;
           case 8:
               System.out.println("Лето");
               break;
           case 9:
               System.out.println("Осень");
               break;
           case 10:
               System.out.println("Осень");
               break;
           case 11:
               System.out.println("Осень");
               break;
           case 12:
               System.out.println("Зима");
               break;
           default:
               System.out.println("Вы ошиблись, такого номера месяца не существует");
       }*/

    }
}