package com.quest.collections.hashmap;

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private int age;
    private String location;

    public Person(int id, String name, String location, int age) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }



    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.id);
    }

}
