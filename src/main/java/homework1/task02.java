//2. Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

package homework1;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
      int year = InputYear();
      if (LeapYear(year)){
          System.out.printf("Год %s - високосный", year);
      }
      else {
          System.out.printf("Год %s не является високосным", year);
      }
    }

    public static int InputYear(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = in.nextInt();
        return year;
    }
    public static boolean LeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0|| year % 400 == 0 );
    }

}
