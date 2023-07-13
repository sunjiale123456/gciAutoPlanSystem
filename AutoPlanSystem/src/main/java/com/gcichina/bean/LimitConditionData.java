package com.gcichina.bean;

public class LimitConditionData {
    private String uuu;
    private String id;
    private String name;
    private String age;

    public LimitConditionData(String uuu, String id, String name, String age) {
        this.uuu = uuu;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getUuu() {
        return uuu;
    }

    public void setUuu(String uuu) {
        this.uuu = uuu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "test{" +
                "uuu='" + uuu + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
