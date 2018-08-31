package com.example.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @author yangfeng12345@139.com
 * @version [版本号, 2018/8/23 13:51]
 * 更新信息 [版本，更新功能，作者，更新日期]
 */
@Component
@SpringBootApplication
public class MyCommandRunner implements CommandLineRunner
{
    private static Logger logger = LoggerFactory.getLogger(MyCommandRunner.class);
    @Value("${spring.web.loginurl}")
    private String loginUrl;

    @Value("${spring.auto.openurl}")
    private boolean isOpen;
    @Override
    public void run(String... args) {
        if(isOpen){
            try{
                Runtime.getRuntime().exec("cmd   /c   start   "+loginUrl+"");
                logger.debug("启动浏览器打开项目成功");
            }catch (Exception e){
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }

}
