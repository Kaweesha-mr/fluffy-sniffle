//exercise 1
//public class Main{
//
//    public static void main (String[] args){
//
//        System.out.println("Hello World !");
//        System.out.println("Its been Nice knowing you");
//        System.out.println("GoodBye World !");
//
//    }
//
//
//}

//exercise 2
//public class Main{
//
//    public static void  main   (String[] args){
//
//        System.out.println("==================================");
//        System.out.println("=\t Student Information \t=");
//        System.out.println("==================================");
//        System.out.println("= Name \t\t : ARDP Ranasignhe \t=");
//        System.out.println("= Reg No \t\t : DIS\\08\\M4\\1234 \t=");
//        System.out.println("= Address \t\t : Malabe \t=");
//        System.out.println("==================================");
//    }
//}

//exercise 3

//import java.util.Scanner;
//
//public class Main{
//
//    public static void main (String[] args){
//
//        Scanner scn = new Scanner(System.in);
//
//        System.out.print("Enter Your age :");
//        int age = scn.nextInt();
//
//        if(age > 18){
//
//            System.out.println("you are an adult");
//        }
//        else{
//
//            System.out.println("you are a child");
//        }
//    }
//}

//exercise 04


//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Value of the day : ");
//        int day  = scn.nextInt();
//
//        switch(day){
//
//            case 1 :
//            {
//                System.out.println("Monday");
//            }
//            case 2 :
//            {
//                System.out.println("Tuesday");
//            }
//            case 3 :
//            {
//                System.out.println("Wednesday");
//            }
//            case 4 :
//            {
//                System.out.println("Thursday");
//            }
//            case 5 :
//            {
//                System.out.println("Friday");
//            }
//            case 6 :
//            {
//                System.out.println("Saturday");
//            }
//            case 7 :
//            {
//                System.out.println("Sunday");
//            }
//
//            default:{
//                System.out.println("Please Enter a valid day");
//            }
//        }
//
//        System.out.println("Good Bye");
//
//
//
//    }
//}

//Exercise 05
//
//public class Main{
//
//    public static void main(String[] args){
//        int i = 0;
//        int j = 0;
//
//        while(i != 5){
//
//            while(j != 5){
//
//                System.out.print("*");
//                j++;
//            }
//
//            i++;
//            j=0;
//            System.out.println();
//        }
//    }
//}

//exercise 5_2
//
//public class Main{
//
//    public static void main(String[] args){
//
//        //loop to run through the lines
//        for(int j = 0; j < 5; j++){
//
//                //loop to make the spaces reduce one by one at a time
//                for(int k = j; k < 4; k++){
//                    System.out.print(" ");
//                }
//
//                //loop to print the stars one by one at a time including a one spance
//                for (int l = 0; l < j+1; l++){
//
//                System.out.print(" *");
//                }
//
//                //separate each lines
//                System.out.println();
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[] args){
//
//        int num1,num2;
//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter number 1");
//        num1 = scn.nextInt();
//
//        System.out.println("Enter number 2");
//        num2 = scn.nextInt();
//
//        System.out.println("Sum of 2 numbers : " + (num1+num2));
//        System.out.println("Average of 2 numbers:"+ ((num1+num2)/2));
//
//
//    }
//
//}
