package HomeWork_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args){

        int[] MyArray = new int[40];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();

        if(a>b) {
            int c = a;
            a = b;
            b = c;
        }

        for(int i = 0; i < 40; i++) {

            int RandomNums = (int) (Math.random() * (b - a)) + a;
            MyArray[i] = RandomNums;

        }

        int Even = 0;
        int Odd = 0;
        int EvenSum = 0;
        int OddSum = 0;

        for (int i : MyArray) {
            if (i % 2 == 0) {
                Even++;
                EvenSum += i;
            }
            else {
                Odd++;
                OddSum += i;
            }
        }
        System.out.println("Even Numbers Are : " + Even);
        System.out.println("Odd Numbers Are : " + Odd);
        System.out.println("Sum Of Even Numbers Are : " + EvenSum);
        System.out.println("Sum Of Odd  Numbers Are : " + OddSum);
    }
}
