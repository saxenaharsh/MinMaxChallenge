package com.HarshSaxena;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int min =  Integer.MAX_VALUE;   //2147483647;
        int max = Integer.MIN_VALUE;    //-2147483648;
       // boolean first = true;

        while(true){
            System.out.println("Enter a number: ");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();

/*                if(first){
                    first = false;
                    min = number;
                    max = number;
                }*/

                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }


            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min mumber = " + min + ", Max number = " + max);
        scanner.close();
    }
}
