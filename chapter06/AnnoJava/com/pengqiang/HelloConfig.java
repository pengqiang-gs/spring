package com.pengqiang;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

// ʹ��Spring Java���ã����ߵ�ǰ������bean��
@Configurable
public class HelloConfig {

	@Bean
	public Hello hello() {
		return new Hello();
	}
}
