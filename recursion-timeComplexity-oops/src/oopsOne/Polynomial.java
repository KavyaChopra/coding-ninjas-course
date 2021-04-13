package oopsOne;

import java.util.Scanner;

public class Polynomial {
    int[] polynomialArray = new int[5];

    public void setCoefficient(int degree, int coefficient) {
        while(degree > this.polynomialArray.length) {
            int[] temp;
            temp = this.polynomialArray;
            this.polynomialArray = new int[2 * polynomialArray.length];
            if (temp.length >= 0) System.arraycopy(temp, 0, this.polynomialArray, 0, temp.length);
        }
        this.polynomialArray[degree] = coefficient;
    }

    public void print() {
        for (int i = 0; i < this.polynomialArray.length; i++) {
            if(polynomialArray[i] != 0)
                System.out.print(polynomialArray[i] + "x" + i + " ");
        }
    }

    public Polynomial add(Polynomial p) {
        for (int i = 0; i < p.polynomialArray.length; i++)
            this.polynomialArray[i]+= p.polynomialArray[i];
        if(p.polynomialArray.length > this.polynomialArray.length) {
            int[] temp;
            temp = this.polynomialArray;
            polynomialArray = new int[p.polynomialArray.length];
            System.arraycopy(p.polynomialArray, temp.length, polynomialArray, temp.length, p.polynomialArray.length - temp.length);
            System.arraycopy(temp, 0, polynomialArray, 0, temp.length);
        }
        return this;
    }

    public Polynomial subtract(Polynomial p) {
        for (int i = 0; i < p.polynomialArray.length; i++)
            this.polynomialArray[i]-= p.polynomialArray[i];
        if(p.polynomialArray.length > this.polynomialArray.length) {
            int[] temp;
            temp = this.polynomialArray;
            polynomialArray = new int[p.polynomialArray.length];
            for (int i = temp.length; i < p.polynomialArray.length; i++)
                polynomialArray[i] = -(p.polynomialArray[i]);
            System.arraycopy(temp, 0, polynomialArray, 0, temp.length);
        }
        return this;
    }

    public Polynomial multiply(Polynomial p) {
        int[] temp = new int[this.polynomialArray.length + p.polynomialArray.length];
        for(int i = 0; i < this.polynomialArray.length; i++) {
            for(int j = 0; j < p.polynomialArray.length; j++)
                temp[i + j]+= this.polynomialArray[i] * p.polynomialArray[j];
        }
        this.polynomialArray = new int[temp.length];
        if (this.polynomialArray.length >= 0)
            System.arraycopy(temp, 0, this.polynomialArray, 0, this.polynomialArray.length);
        return this;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] degree1 = new int[n];
        for(int i = 0; i < n; i++)
            degree1[i] = s.nextInt();
        int[] coefficient1 = new int[n];
        for(int i = 0; i < n; i++)
            coefficient1[i] = s.nextInt();
        Polynomial first = new Polynomial();
        System.out.println();
        for(int i = 0; i < n; i++)
            first.setCoefficient(degree1[i],coefficient1[i]);
        first.print();
        n = s.nextInt();
        int[] degree2 = new int[n];
        for(int i = 0; i < n; i++)
            degree2[i] = s.nextInt();
        int[] coefficient2 = new int[n];
        for(int i = 0; i < n; i++)
            coefficient2[i] = s.nextInt();
        Polynomial second = new Polynomial();
        for(int i = 0; i < n; i++)
            second.setCoefficient(degree2[i],coefficient2[i]);
        System.out.println();
        second.print();
        int choice = s.nextInt();
        Polynomial result;
        switch (choice) {
            case 1 -> {
                result = first.add(second);
                result.print();
            }
            case 2 -> {
                result = first.subtract(second);
                result.print();
            }
            case 3 -> {
                result = first.multiply(second);
                result.print();
            }
        }
    }
}
