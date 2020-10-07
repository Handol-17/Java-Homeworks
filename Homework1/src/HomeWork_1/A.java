package HomeWork_1;

import java.util.*;

public class A {

    int x;
    String Text;

    public A() {
        Text = "Hello";
    }

    public static void main(String[] args) {
        B MyObj = new B();
        System.out.println(MyObj.Text);
        MyObj.VarX();
        MyObj.ExampleOfX();
        MyObj.OddOrEven();
        MyObj.VarY();
        MyObj.SumOfNumbers();

    }

    void VarX() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        x = sc.nextInt();

    }

    void ExampleOfX() {

        System.out.println("Answer Of X+12 Is : " + (x + 12));

    }

    void OddOrEven() {

        if (x % 2 == 0) {

            System.out.println("Your Number Is Even");

        } else {

            System.out.println("Your Number Is Odd");

        }
    }

    static class B extends A {

        int y;

        public B() {

        }

        void VarY() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Y");
            y = scanner.nextInt();
        }

        void SumOfNumbers(){

            System.out.println("Sum Of X And Y Is : " + (x + y));

        }
    }
}

