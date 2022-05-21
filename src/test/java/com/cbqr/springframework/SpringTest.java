package com.cbqr.springframework;

import com.cbqr.springframework.bean.UserService;
import com.cbqr.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.cbqr.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.cbqr.springframework.common.MyBeanFactoryPostProcessor;
import com.cbqr.springframework.common.MyBeanPostProcessor;
import com.cbqr.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * 对 Spring 容器进行测试
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class SpringTest {

    @Test
    public void testBeanFactoryPostProcessorAndBeanPostProcessor(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 3. BeanDefinition 加载完成 & Bean实例化之前，修改 BeanDefinition 的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        // 4. Bean实例化之后，修改 Bean 属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        // 5. 获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void testXml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

}
