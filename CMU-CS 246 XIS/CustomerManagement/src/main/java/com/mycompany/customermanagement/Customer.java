/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customermanagement;

import java.util.Date;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Customer {

    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private Date DayMonthYearsAdds;
    private String address;
    private int phone;
    private int job;
    private String sex;

    public Customer(String name, int age, Date DayMonthYearsAdds, String address, int phone, int job, String sex) {
        this.name = name;
        this.age = age;
        this.DayMonthYearsAdds = DayMonthYearsAdds;
        this.address = address;
        this.phone = phone;
        this.job = job;
        this.sex = sex;
    }
    public Customer(){}

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

    public Date getDateMonthYearsAdds() {
        return DayMonthYearsAdds;
    }

    public void setDateMonthYearsAdds(Date DateMonthYearsAdds) {
        this.DayMonthYearsAdds = DateMonthYearsAdds;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", age=" + age + ", DayMonthYearsAdds=" + DayMonthYearsAdds + ", address=" + address + ", phone=" + phone + ", job=" + job + ", sex=" + sex + '}';
    }

    public void Input() {
        int d, m, y;
        System.out.println("Enter Name:");
        setName(sc.nextLine());
        System.out.println("Enter Age");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Day");
        d = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Month");
        m = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Year");
        y = sc.nextInt();
        sc.nextLine();
    }

    public void output() {
        System.out.println("Name" + this.name);
        System.out.println("Age" + this.age);
        System.out.println("EmpDateOfBirth:" + this.DayMonthYearsAdds.getDay() + "/" + this.DayMonthYearsAdds.getMonth() + "/" + this.DayMonthYearsAdds.getYear());
    }      
}
