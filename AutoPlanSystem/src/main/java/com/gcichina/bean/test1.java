package com.gcichina.bean;

public class test1 {
    int age;
    int id;
    String name;

    public test1(int id, String name ,int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    @Override
    public String toString() {
        return "test1{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
