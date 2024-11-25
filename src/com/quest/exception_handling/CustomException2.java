package com.quest.exception_handling;

import java.sql.SQLException;



public class CustomException2 extends CustomException{
    private String query;
    CustomException2(String name, int num1, int num2 , String query) {
        super(name, num1, num2);
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
    public void executeQuery() {
        try{
            display(query);

        }catch (SQLException s){
            s.printStackTrace();
        }
    }
    public void display(String query)throws SQLException{
        if(!query.equalsIgnoreCase("select * from CUSTOMERS")){
            throw new  SQLException("query changed");
        }
        else System.out.println(query);
    }
}
