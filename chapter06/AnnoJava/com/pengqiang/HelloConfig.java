package com.pengqiang;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

// 使用Spring Java配置，告诉当前配置在bean中
@Configurable
public class HelloConfig {

	@Bean
	public Hello hello() {
		return new Hello();
	}
}
