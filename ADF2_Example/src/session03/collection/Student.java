/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session03.collection;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Student implements Comparable, Serializable{

    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 10;
        hash = 11 * hash + Objects.hashCode(this.rollNo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return this.rollNo.equals(other.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student s = (Student)o;
            return this.rollNo.compareTo(s.rollNo);
        }
        return 0;
    }
}
