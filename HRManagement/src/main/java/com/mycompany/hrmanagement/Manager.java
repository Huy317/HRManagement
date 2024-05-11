/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Manager {
    ArrayList<FullTimeEmployee> fullTimeList = new ArrayList<>();
    ArrayList<PartTimeEmployee> partTimeList = new ArrayList<>();

    public Manager() {
    }

    public Manager(ArrayList<FullTimeEmployee> full, ArrayList<PartTimeEmployee> part){
        this.fullTimeList = full;
        this.partTimeList = part;
    }
    
    public void addFullTimeEmp(){
        FullTimeEmployee emp = new FullTimeEmployee();
        emp.InputFullTimeEmployee();
        fullTimeList.add(emp);
    }
    public void addFullTimeEmp(FullTimeEmployee emp){
        fullTimeList.add(emp);
    }
    public void addPartTimeEmp(){
        PartTimeEmployee emp = new PartTimeEmployee();
        emp.InputPartTimeEmployee();
        partTimeList.add(emp);
    }
    public void addPartTimeEmp(PartTimeEmployee emp){
        partTimeList.add(emp);
    }
    public void displayFullTimeList(){
        for (FullTimeEmployee i : fullTimeList){
            System.out.println(i.getInfo());
        }
    }
    public void displayPartTimeList(){
        for (PartTimeEmployee i : partTimeList){
            System.out.println(i.getInfo());
        }
    }
}
