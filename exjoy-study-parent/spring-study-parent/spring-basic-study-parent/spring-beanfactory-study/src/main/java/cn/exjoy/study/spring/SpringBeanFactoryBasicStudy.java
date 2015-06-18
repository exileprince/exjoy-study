package cn.exjoy.study.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryBasicStudy {

    /**
     * @param args
     */
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("context.xml");

        //XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        //Resource resource = new ClassPathResource("context.xml");
        //reader.loadBeanDefinitions(resource);

        TestBean bean1 = (TestBean) factory.getBean("testBean1");
        TestBean bean2 = (TestBean) factory.getBean("testBean1");

        bean1.display();
        bean2.display();
    }

}
