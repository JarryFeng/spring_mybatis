package com.feng.mapper;

import com.feng.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jarry on 2017/11/7.
 * mybatis的接口编程
 * 接口的路径对应mapper的namespace
 */
public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);

    public void addEmployee(Employee employee);

    public int deleteEmployee(Integer id);

    public void updateEmployee(Employee employee);

    public Employee getEmpByCondition(Integer id, List<Employee> employees);

    public Employee unionQuery(Integer id);

    public Employee getEmpByStep(Integer id);

    public Employee getWhereCondition(Employee employee);

    public Employee getChooseCondition(Employee employee);

    public void updateDynamic(Employee employee);

    public void updateByIdList(int[] alist, String ax);

    public void addBatchEmployee(@Param("emps") List<Employee> employees);
}
