package com.quest.practice_variables;

public class RepeatedElements {
    public static void main(String[] args) {
        byte[] elements = new byte[]{1,2,3,4,5,5,6,7,8};
       boolean[] check = new boolean[elements.length];
       for(byte i = 0; i<elements.length-1 ; i++){
           for(byte j = (byte) (i+1); j<elements.length; j++){
               if(elements[i] == elements[j]){
                   System.out.println("duplicate elements "+i+" "+j);
                   break; // to next iteration
               }
           }


       }

    }
}
