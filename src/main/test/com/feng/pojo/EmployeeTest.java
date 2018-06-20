package com.feng.pojo;

import com.feng.mapper.DepartmentMapper;
import com.feng.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jarry on 2017/11/7.
 */
public class EmployeeTest {

    private static SqlSessionFactory sqlSessionFactory;

    @Test
    public void test() {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        SqlSession sqlSession2 = getSqlSessionFactory().openSession();
        try {
            //Employee o = (Employee) sqlSession.selectOne("com.feng.mapper.EmployeeMapper.getEmployeeById", "2");
            EmployeeMapper employeeMapper01 = sqlSession.getMapper(EmployeeMapper.class);
            Employee emp01 = employeeMapper01.getEmployeeById(2);
            System.out.println(emp01);
            sqlSession.close();

            EmployeeMapper employeeMapper02 = sqlSession2.getMapper(EmployeeMapper.class);
            Employee emp02 = employeeMapper02.getEmployeeById(2);
            System.out.println(emp02);

            sqlSession2.close();


        } finally {
            //sqlSession.close();
        }

    }

    /**
     * SqlSessionFactory是MyBatis的关键对象,它是个单个数据库映射关系经过编译后的内存镜像.
     * SqlSessionFactory对象的实例可以通过SqlSessionFactoryBuilder对象类获得,
     * 而SqlSessionFactoryBuilder则可以从XML配置文件或一个预先定制的Configuration的实例构建出SqlSessionFactory的实例.
     * 每一个MyBatis的应用程序都以一个SqlSessionFactory对象的实例为核心.同时SqlSessionFactory也是线程安全的,
     * SqlSessionFactory一旦被创建,应该在应用执行期间都存在.
     * 注意：在应用运行期间不要重复创建多次,建议使用单例模式.SqlSessionFactory是创建SqlSession的工厂
     *
     * @return
     */
    private static SqlSessionFactory getSqlSessionFactory() {
        InputStream inputStream = EmployeeTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        if (sqlSessionFactory == null) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;
    }

    @Test
    public void test2() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
           /* Employee employee = employeeMapper.getEmployeeById(2);
            System.out.println(employee);*/

            System.out.println("删");
            int i = employeeMapper.deleteEmployee(1);
            System.out.println(i);
            /* System.out.println("改");
            employeeMapper.updateEmployee(new Employee(2,"库里2", "1", "2@qq.com"));*/

        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void test3() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            System.out.println("增");
            Employee employee1 = new Employee(null, "库里", "0", "1@qq.com", 1);
            employeeMapper.addEmployee(employee1);
            System.out.println(employee1);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test4() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee emp = new Employee(null, "李四", "1", "1@qq.com", 1);
            Employee emp2 = new Employee(null, "李四2", "1", "1@qq.com", 1);
            Employee emp3 = new Employee(null, "李四3", "1", "1@qq.com", 1);
            List<Employee> list = new ArrayList<Employee>();
            list.add(emp);
            list.add(emp2);
            list.add(emp3);
            Employee employee = employeeMapper.getEmpByCondition(2, list);
            System.out.println(employee);

        } finally {
            sqlSession.close();
        }
    }


    @Test
    public void test5() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.unionQuery(2);
            System.out.println(employee);

        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test6() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmpByStep(2);
            System.out.println(employee.getDepartment().getName());
            //System.out.println(employee.getDepartment());

        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test7() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
            Department deptAndEmpListById = mapper.getDeptAndEmpListById(1);
            System.out.println(deptAndEmpListById);

        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test8() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.setId(2);
            employee.setLastName("李四");
            employee = mapper.getChooseCondition(employee);
            System.out.println(employee);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test9() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.setId(2);
            employee.setLastName("李四2");
            employee.setGender("1");
            mapper.updateDynamic(employee);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test10() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            List<Integer> idList = new ArrayList<Integer>();
            idList.add(2);
            idList.add(10);
            int[] a = {2, 10};
            mapper.updateByIdList(a, "李四2");
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test11() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            List<Employee> list = new ArrayList<Employee>();
            Employee employee = new Employee();
            employee.setGender("2");
            employee.setLastName("wangwu");
            employee.setEmail("youjian1");
            employee.setDeptId(1);
            list.add(employee);

            Employee employee2 = new Employee();
            employee2.setGender("3");
            employee2.setLastName("wangwu3");
            employee2.setEmail("youjian13");
            employee2.setDeptId(1);
            list.add(employee2);
            mapper.addBatchEmployee(list);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

}