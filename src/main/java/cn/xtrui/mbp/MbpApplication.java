package cn.xtrui.mbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("cn.xtrui.mbp.mapper")
@SpringBootApplication
public class MbpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbpApplication.class, args);
    }

}
