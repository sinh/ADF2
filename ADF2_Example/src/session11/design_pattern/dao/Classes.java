/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11.design_pattern.dao;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Classes {

    private String className;
    private String location;

    public Classes() {
    }

    public Classes(String className, String location) {
        this.className = className;
        this.location = location;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
