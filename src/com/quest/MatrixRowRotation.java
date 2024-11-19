package com.quest;

public class MatrixRowRotation {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] elements : matrix) {
            reverse(elements);
        }
        System.out.println("Reversed Matrix");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
        //to reverse the row
    public static void reverse(int[] elements) {
        int temp ;
        byte i = 0;
        while(i<elements.length/2){
            temp = elements[i];
            elements[i] = elements[elements.length-1-i];
            elements[elements.length-1-i] = temp;
            i++;
        }
    }
}
