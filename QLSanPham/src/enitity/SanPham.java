/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitity;

import java.io.Serializable;

/**
 *
 * @author Duc
 */
public class SanPham implements Serializable{
    private String name;
    private String ID;
    private double salary;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SanPham() {
    }

    public SanPham(String name, String ID, double salary, String status) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.status = status;
    }
}
