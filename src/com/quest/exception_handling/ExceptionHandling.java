package com.quest.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valueArr = new int[]{1, 2, 3, 4, 5};
        try {
            System.out.println("Enter two numbers");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int result = n1 / n2;
            System.out.println("Result : " + result);
            System.out.println("enter the index");
            int in = sc.nextInt();
            System.out.println("value at index : " + valueArr[in]);
        } catch (ArithmeticException a) {
            System.out.println("Arithmetic exception divide by zero");
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("Index out bond exception");
        } catch (NullPointerException n) {
            System.out.println("Null pointer exception  null value accessed");
        } catch (InputMismatchException i) {
            System.out.println("Input mismatches");
        } finally {
            System.out.println("complete exception handling");
        }
    }
}
