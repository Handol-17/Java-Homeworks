package HomeWork_1;

import java.util.Scanner;

public class C {

    int a, b, c;

    public static void main(String[] args) {

        C main_class = new C();

        main_class.variables();
        System.out.println("Last Digit Of A Is : " + main_class.SecondMethod());
        System.out.println("First Digit Of B Is : " + main_class.ThirdMethod());
        System.out.println("Sum Of C Digits Is : " + main_class.FourthMethod());
        System.out.println("Multiply Of Last Digit And First Digit Is: " + main_class.FifthMethod());
        System.out.println("Sum Of First Digit And Multiply Of Last Digit And First Digit Is : " + main_class.SixthMethod());

    }

    void variables() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        a = sc.nextInt();
        System.out.println("Enter B");
        b = sc.nextInt();
        System.out.println("Enter C");
        c = sc.nextInt();

    }

    int SecondMethod() {

        return a % 10;

    }


    int ThirdMethod() {

        while (b > 9) {

            b /= 10;

        }

        return b;

    }

    int FourthMethod() {

        int sum = 0;

        while (c != 0) {

            sum += (c % 10);
            c /= 10;

        }

        return sum;
    }

    int FifthMethod() {

        return SecondMethod() * ThirdMethod();

    }

    int SixthMethod() {

        return ThirdMethod() + FifthMethod();

     }
}