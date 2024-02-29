package org.example;

import java.util.Scanner;

public class Main {

    // EASY DIFFICULTY Exercise 1
    public static void main(String[] args) {
        int number = 7;
        int result = calculateFactorial(7);
        System.out.println(result);
    }

    private static int calculateFactorial(int n) {
        if (n >= 1)
            return n * calculateFactorial(n - 1);
        else return n;
    }




// EASY DIFFICULTY EXERCISE 2
    public class Rectangle {
        int length;
        int width;
        public int calculateArea() {
            return length * length;
        }

        public int calculatePerimeter() {
            return (length * 2) + (width * 2);
        }
    }


// EASY DIFFICULTY EXERCISE 3

    /*

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        int result = 0;
        for (int i=0; i < array.length; i++){
            if(array[i] % 2 == 0)
                result = result + array[i];
        }
        System.out.println(result);
    }


// EASY DIFFICULTY EXERCISE 4
public class Student {
    public String name;
    public int age;
    public int[] grades;

    public double calculateAverage(){
        int sum = 0;
        for (int i=0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        double average = sum / grades.length;
        return average;
    }

    public void printDetails(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        double average = calculateAverage();
        System.out.println("average = "+ average);
    }
}


// EASY DIFFICULTY EXERCISE 5
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputArray = input.toCharArray();

        int j = 0;
        for (int i = inputArray.length-1; i >= 0; i--) {
            System.out.print(inputArray[i]);
        }
    }


//*************************************************************


// MEDIUM DIFFICULTY EXERCISE 1
    public class Student {
        public String name;
        public int age;
        public int[] grades;

        public double calculateAverage(){
            int sum = 0;
            for (int i=0; i < grades.length; i++) {
                sum = sum + grades[i];
            }
            double average = sum / grades.length;
            return average;
        }

        public void printDetails(){
            System.out.println("name = " + name);
            System.out.println("age = "+ age);
            double average = calculateAverage();
            System.out.println("average= " + average);
        }
    }


// MEDIUM DIFFICULTY EXERCISE 2
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input = Integer.parseInt(scanner.nextLine());
        while (input >= 0){
            sum = sum + input;
            count++;
            input = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("sum = " + sum);
        double average = sum / count;
        System.out.println("average = " + average);
    }


// MEDIUM DIFFICULTY EXERCISE 3



*/



}









