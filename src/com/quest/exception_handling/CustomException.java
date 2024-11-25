package com.quest.exception_handling;

public class CustomException {
    private String name;
    private int num1;
    private int num2;
    CustomException(String name , int num1 ,int num2){
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getName() {
        return name;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void  divide(){
        try{
            int res = getNum1() / getNum2();
            System.out.println(getName()+"'s result is :" + res);
        }catch (ArithmeticException a){
            a.printStackTrace();
        }finally {
            System.out.println("exception handled");
        }

    }
}
