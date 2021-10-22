package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;

        double y;

        double R;

        String result;

        System.out.println("Введіть значення для R: ");
        R = sc.nextDouble();



        for (int i = 0; i < 10; i++) {
            x = Math.random() * R * 2 - R;
            y = Math.random() * R * 2 - R;

            if (y <= Math.sqrt(Math.pow(R, 2) - Math.pow(x, 2)) && x <= Math.sqrt(Math.pow(R, 2) - Math.pow(y, 2)) && x >= 0 && y >= 0)
            {
                result = "Належить. ";
            }

            else if (y >= -Math.sqrt(Math.pow(R, 2) - Math.pow(x, 2)) && x >= -Math.sqrt(Math.pow(R, 2) - Math.pow(y, 2)) && x <= 0 && y <= 0)
            {
                result = "Належить. ";
            }

            else if(y <= x + R && x >= y - R)
            {
                result = "Належить. ";
            }
            else {
                result = "Не належить. ";
            }
            System.out.println(result + "(" + x + "; " + y + ")");
        }






    }
}