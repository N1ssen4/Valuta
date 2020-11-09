package com.kea;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double amount, dollar, pound, scan, euro, yen, rupee;
        DecimalFormat d = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Chose which currencies you would like to convert :");
        System.out.println("1: American Dollars");
        System.out.println("2: British Pounds");
        System.out.println("3: Euro");
        System.out.println("4: Japanese Yen");
        System.out.println("5: Russian Rupees");
        System.out.println(": ");
        scan = sc.nextInt();

        System.out.println("How much would like to convert?");
        System.out.println(": ");
        amount = sc.nextFloat();

        if (scan==1) {

            rupee = amount * 77;
            System.out.println("The " + amount + " Dollars are: "+ d.format(rupee) + " rupees" );

            pound = amount * 0.76;
            System.out.println("The " + amount + " Dollars are: "+ d.format(pound) + " pound");

            euro = amount * 0.842;
            System.out.println("The " + amount + " Dollars are: "+ d.format(euro) + " euro");

            yen = amount * 103.308;
            System.out.println("The " + amount + " Dollars are: "+ d.format(yen) + " yen");
        }
        else if (scan==2) {

            rupee = amount * 101.888;
            System.out.println("The " + amount + " Pounds are: "+ d.format(rupee) + " rupees" );

            dollar = amount * 1.316;
            System.out.println("The " + amount + " Pounds are: "+ d.format(dollar) + " dollar");

            pound = amount * 1.108;
            System.out.println("The " + amount + " Pounds are: "+ d.format(pound) + " pound");

            yen = amount * 136.001;
            System.out.println("The " + amount + " Pounds are: "+ d.format(yen) + " yen");
        }
        else if (scan==3) {

            rupee = amount * 91.96;
            System.out.println("The " + amount + " Euros are: "+ d.format(rupee) + " rupees" );

            dollar = amount * 1.188;
            System.out.println("The " + amount + " Euros are: "+ d.format(dollar) + " dollar");

            pound = amount * 0.903;
            System.out.println("The " + amount + " Euros are: "+ d.format(pound) + " pound ");

            yen = amount * 122.749;
            System.out.println("The " + amount + " Euros are: "+ d.format(yen) + " yen");
        }
        else if (scan==4) {

            rupee = amount * 0.749;
            System.out.println("The " + amount + " Yen are: "+ d.format(rupee) + " rupees" );

            dollar = amount * 0.01;
            System.out.println("The " + amount + " Yen are: "+ d.format(dollar) + " dollar");

            pound = amount * 0.007;
            System.out.println("The " + amount + " Yen are: "+ d.format(pound) + " pound ");

            euro = amount * 0.008;
            System.out.println("The " + amount + " Yen are: "+ d.format(euro) + " euro");
        }

        else if (scan==5) {
            dollar = amount / 77;
            System.out.println("The " + amount + " Rupees are: "+ d.format(dollar) + " dollar" );

            pound = amount / 101;
            System.out.println("The " + amount + " Rupees are: "+ d.format(pound) + " pound");

            euro = amount / 91;
            System.out.println("The " + amount + " Rupees are: "+ d.format(euro) + " euro");

            yen = amount / 0.749;
            System.out.println("The " + amount + " Rupees are: "+ d.format(yen) + " yen");
        }

    }
}
