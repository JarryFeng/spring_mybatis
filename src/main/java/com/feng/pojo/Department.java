package com.feng.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jarry on 2017/11/13.
 */
public class Department implements Serializable {
    private Integer id;

    private String name;

    private String deptCode;

    private List<Employee> employeeList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
