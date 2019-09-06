package cn.xtrui.mbp.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.FileType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MBPG {
    //C:\Users\haito\IdeaProjects\mbp\src\main\java
    public static void main(String[] args) {




         AutoGenerator mpg = new AutoGenerator();
         //全局配置

        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        gc.setOutputDir(projectPath+ "/src/main/java")
                .setAuthor("tianrui")
                .setActiveRecord(true)
                .setFileOverride(true)
                .setServiceName("%sService")
                .setBaseResultMap(true)
                .setBaseColumnList(true);
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/jdbc")
                .setUsername("root")
                .setPassword("123456")
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setDbType(DbType.MYSQL);
        mpg.setDataSource(dataSourceConfig);

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setInclude("books,books2,customer".split(","));
        mpg.setStrategy(strategyConfig);

        //包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setController("controller")
                .setParent("cn.xtrui.mbp")
                .setMapper("mapper")
                .setService("service")
                .setEntity("bean")
                .setXml(null)
                .setServiceImpl("servicelmp");
        mpg.setPackageInfo(packageConfig);





        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/"
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        /*
        cfg.setFileCreate(new IFileCreate() {
            @Override
            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                // 判断自定义文件夹是否需要创建
                checkDir("调用默认方法创建的目录");
                return false;
            }
        });
        */
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);


        mpg.execute();





        //测试2




    }
}
