package com.quest.collections;

import com.quest.collections.hashmap.Person;

public class SortingExample implements Comparable<SortingExample> {
        private int id;
        private String name;
        private int age;
        private String location;

        public SortingExample(int id, String name, String location, int age) {
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
    public int compareTo(SortingExample o) {
        return Integer.compare(this.id,o.id);
    }

    @Override
    public String toString() {
        return "SortingExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
    public String display(){
            return this.toString();
    }
}
