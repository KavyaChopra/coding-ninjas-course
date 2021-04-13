package oopsOne;

import java.util.Scanner;

public class ComplexNumbers {
    private int realPart;
    private int complexPart;

    public ComplexNumbers(int realPart, int complexPart) {
        this.complexPart = complexPart;
        this.realPart = realPart;
    }

    public ComplexNumbers plus(ComplexNumbers c) {
        this.realPart+= c.realPart;
        this.complexPart+= c.complexPart;
        return this;
    }

    public ComplexNumbers multiply(ComplexNumbers c) {
        int realPart = this.realPart;
        this.realPart = this.realPart * c.realPart - (this.complexPart * c.complexPart);
        this.complexPart = realPart * c.complexPart + this.complexPart * c.realPart;
        return this;
    }

    public void print() {
        System.out.print(this.realPart + " + i" + this.complexPart);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();


        if(choice == 1) {
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            c1.multiply(c2);
            c1.print();
        }
    }
}
