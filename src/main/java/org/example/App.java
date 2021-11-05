package org.example;

import org.example.domain.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 85217
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher bean = applicationContext.getBean(Teacher.class);
        bean.show();
    }
}
