package com.quest.oops.inheritance;

public class Employee extends StaffRegister {
    String employee_name ;
    Employee(String emp_name , String company_name , int year, int reg_no){
        super(company_name,year,reg_no);
        this.employee_name = emp_name;
    }
    public  void employeeDisplay(){
        System.out.println("Employee name = "+this.employee_name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Robin","xyz company",2000,101);
        emp.employeeDisplay();
        emp.displayName();
    }
}
