package com.feng.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jarry on 2017/12/18.
 * java代码生成
 *  对象
 *  mapper
 *
 */
public class Test {

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;

        InputStream resourceAsStream = Test.class.getClassLoader().getResourceAsStream("generator/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(resourceAsStream);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);


        Context ctx = new InitialContext();
        ctx.lookup("111");
    }
}
