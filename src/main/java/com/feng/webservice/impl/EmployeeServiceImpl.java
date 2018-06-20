package com.feng.webservice.impl;

import com.feng.pojo.Employee;
import com.feng.webservice.EmployeeService;

/**
 * Created by jarry on 2017/12/15.
 */
public class EmployeeServiceImpl implements EmployeeService{
    public Employee queryEmployee(long id) {
        //使用静态数据来表示
        Employee employee=new Employee();
        employee.setEmail("1@qq.com");
        employee.setLastName("lastName");
        employee.setGender("1");
        return employee;
    }
}
