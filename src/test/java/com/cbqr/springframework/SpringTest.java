package com.cbqr.springframework;

import com.cbqr.springframework.bean.UserService;
import com.cbqr.springframework.beans.factory.config.BeanDefinition;
import com.cbqr.springframework.beans.factory.support.DefaultListableBeanFactory;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 对 Spring 容器进行测试
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class SpringTest {

    @Test
    public void testBeanFactory() {
        // 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "Dave");
        userService.queryUserInfo();
    }

    @Test
    public void testCglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"Dave"});
        System.out.println(obj);
    }

    @Test
    public void testNewInstance() throws IllegalAccessException, InstantiationException {
        UserService userService = UserService.class.newInstance();
        System.out.println(userService);
    }

    @Test
    public void testConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<UserService> userServiceClass = UserService.class;
        Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(String.class);
        UserService userService = declaredConstructor.newInstance("Dave");
        System.out.println(userService);
    }

    @Test
    public void testParameterTypes() throws Exception {
        Class<UserService> beanClass = UserService.class;
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        Constructor<?> constructor = null;
        for (Constructor<?> ctor : declaredConstructors) {
            if (ctor.getParameterTypes().length == 1) {
                constructor = ctor;
                break;
            }
        }
        Constructor<UserService> declaredConstructor = beanClass.getDeclaredConstructor(constructor.getParameterTypes());
        UserService userService = declaredConstructor.newInstance("Dave");
        System.out.println(userService);
    }

}
