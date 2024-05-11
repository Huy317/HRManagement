/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;
import java.util.*;
/**
 *
 * @author Student
 */
public abstract class Employee {
    protected String id;
    protected String name;
    protected int yearOfBirth;
    protected String address;
    protected String phone;

    protected abstract String getInfo();
    protected abstract float getPayment();

    protected Employee(String id, String name, int yearOfBirth, String address, String phone) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    protected Employee() {
    }
    protected void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Year of birth: ");
        yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Phone: ");
        phone = sc.nextLine();
    }
}
