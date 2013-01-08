package cn.exjoy.study.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringBeanFactoryBasicStudy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		Resource resource = new ClassPathResource("context.xml");

		reader.loadBeanDefinitions(resource);

		MockBean bean = (MockBean) factory.getBean("testBean");
		System.out.println(bean.getMessage());
	}

}
