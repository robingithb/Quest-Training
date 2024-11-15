package com.quest.oops.inheritance;

public class Complany {
    String company_name;
    int year;
    Complany(String company_name,int year){
        this.company_name = company_name;
        this.year = year;
    }
    public  void displayName(){
        System.out.println("Company Name is "+this.company_name);
        System.out.println("Established year "+this.year );
    }
}
