package test;

import com.hc.service.test_Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {

    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        test_Service as = (test_Service) ac.getBean("test_Service");
        as.findAll();
    }


}
