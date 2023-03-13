package com.developer.studentManagement;

public class Student {
    private int admnNo;
    private int age;
    private String branch;
    private String name;

    public Student(int admnNo, int age, String branch, String name) {
        this.admnNo = admnNo;
        this.age = age;
        this.branch = branch;
        this.name = name;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
