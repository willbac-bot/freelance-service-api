package com.freelance.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class FreelanceServiceApiApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		// Verifica se o contexto foi carregado corretamente
		assert(applicationContext != null);

		// Verifica se um bean específico está presente no contexto
		assert(applicationContext.containsBean("someBeanName"));
	}
}
