package com.pengqiang;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("app-bean.xml"));
		HelloSpring obj = (HelloSpring)factory.getBean("helloSpring");
		obj.getMessage();
	}
}
