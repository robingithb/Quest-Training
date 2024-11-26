package com.quest.collections;

public class CollectionExample {
    private String name ;
    private int age;
    private String location;
   CollectionExample(String name , int age,String location){
       this.name = name;
       this.age = age;
       this.location = location;
   }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
