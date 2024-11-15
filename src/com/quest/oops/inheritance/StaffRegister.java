package com.quest.oops.inheritance;

public class StaffRegister extends Complany{
    int resisterNumber;
    StaffRegister(String company_name , int year ,int register_number){
        super(company_name,year);
        this.resisterNumber = register_number;
    }

    @Override
    public void displayName() {
        super.displayName();
        System.out.println("Redister Number is = "+this.resisterNumber +"at " + company_name );
    }
}
