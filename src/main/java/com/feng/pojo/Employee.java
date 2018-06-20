package com.feng.pojo;

import org.apache.ibatis.type.Alias;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by jarry on 2017/11/6.
 */
@XmlRootElement(name="employee")
public class Employee implements Serializable {
    private Integer id;

    private String lastName;

    private String gender;

    private String email;

    private Integer deptId;

    //private List<Department> department;
    private Department department;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String gender, String email, Integer deptId) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.deptId = deptId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", deptId=" + deptId +
                ", department=" + department +
                '}';
    }
}
