package com.feng.mapper;

import com.feng.pojo.Department;

/**
 * Created by jarry on 2017/11/15.
 */
public interface DepartmentMapper {

    public Department getDeptById(Integer id);

    public Department getDeptAndEmpListById(Integer id);
}
