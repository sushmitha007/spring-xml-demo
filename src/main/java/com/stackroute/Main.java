package com.stackroute;

import com.stackroute.domain.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args){;
        HelloWorld helloWorld=new HelloWorld();
        System.out.println(helloWorld.getMessage());

        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        HelloWorld helloWorld1=(HelloWorld) beanFactory.getBean("helloWorld");
        System.out.println(helloWorld1.getMessage());

        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        HelloWorld helloWorld2=((DefaultListableBeanFactory) beanDefinitionRegistry).getBean(HelloWorld.class);
        System.out.println(helloWorld2.getMessage());

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld3=context.getBean(HelloWorld.class);
        System.out.println(helloWorld3.getMessage());




    }



}
