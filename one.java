package Java;

import java.io.StringBufferInputStream;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class one {
    public static void main (String[]args){

// Write a Java program to count letters,
// ###############################################################
  
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter The String ");

 String sen= scanner.nextLine();

 int countstring=0;


 for (int i=0;i<sen.length();i++){
    char getchar = sen.charAt(i);
    if (Character.isLetter(getchar)) {

        countstring++;

        
    }

 }

 System.out.println("Count of string is "+ countstring);



// ###############################################################################
// Write a Java program to reverse a string.


// Scanner input = new Scanner(System.in);

// System.out.println("Enter the Sentance ");

// String sentance=input.nextLine();

// String reversed = "";

// for(int  i=sentance.length()-1; i>=0;  i--){

//     reversed= reversed+sentance.charAt(i);


// }

// System.out.println("Reversed String is "+reversed);



// ###################################################################################
// Write a Java program and compute the sum of an integer's digits.

//   Scanner input = new Scanner(System.in);

//   System.out.println("Enter The number");
//   int number = input.nextInt();

//   int sum =0;

//   number=Math.abs(number);


//   while (number>0) {
//     int lastdigit = number%10;
//     sum= sum+lastdigit;
//     number = number/10;

//   }

//   System.out.println("The sum of digit is "+sum);

        


// #################################################################################
// Write a Java program to compare two numbers.

// Scanner input = new Scanner(System.in);

// System.out.println("Enter the First Number");
// int number1 = input.nextInt();


// System.out.println("Enter the secoud Number");
// int number2=input.nextInt();

// if (number1!=number2) {
//     System.out.println("Both number are differnt ");
//     System.out.println("cheacking which number is grater");

//     if (number1>number2) {
//         System.out.println(number1 + "Number is grater");

//     }
//     else{
//         System.out.println(number2 +" "+ "Is grater number");
//     }

// }
// else{
//     System.out.println("Both number are same");
// }







// #################################################################################
// Find any number binary value 


        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter The Number");

        // int deci = input.nextInt();

        // String abc= Integer.toBinaryString(deci);

        // System.out.println("Binery reprasentaion is "+ abc);
   
 // #################################################################################
//  Additon of two Binery number 


        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter The number");
        // int num1= input.nextInt();

        // System.out.println("Enter The Secound number");
        // int num2= input.nextInt();

        // String number1= Integer.toBinaryString(num1);
        // String number2= Integer.toBinaryString(num2);

        //   int sum =Integer.parseInt(number1,2)+ Integer.parseInt(number2,2);

        //   String Totalsum = Integer.toBinaryString(sum);

        //   System.out.println("Total binary  sum of"+num1 + "and" +num2 +"this number "+Totalsum);

    }
}
