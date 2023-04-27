package cn.vcorp.ghrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class GhrmApplication
{
    public static void main(String[] args)
    {
        /*
         System.setProperty("spring.devtools.restart.enabled", "false");
        */
        //SpringApplication.run(cn.vcorp.ghrm.GhrmApplication.class, args);
        SpringApplication app = new SpringApplication(cn.vcorp.ghrm.GhrmApplication.class);
        app.setLazyInitialization(true);
        app.run(args);
        System.out.println("GHRM启动成功");
    }
}
