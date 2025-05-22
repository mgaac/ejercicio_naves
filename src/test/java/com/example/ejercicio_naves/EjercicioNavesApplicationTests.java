package com.example.ejercicio_naves;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EjercicioNavesApplicationTests {

	@Autowired
	EntityManager entityManager;

	@Test
	void contextLoads() {
	}

	@Test
	void testEntitiesPresent() {
		boolean hasNaves = entityManager.getMetamodel().getEntities().stream().map(EntityType::getName).anyMatch(n -> n.equals("DfNave"));
		boolean hasLineas = entityManager.getMetamodel().getEntities().stream().map(EntityType::getName).anyMatch(n -> n.equals("DfLinea"));
		boolean hasAnunav = entityManager.getMetamodel().getEntities().stream().map(EntityType::getName).anyMatch(n -> n.equals("DfAnunav"));
		assertThat(hasNaves).isTrue();
		assertThat(hasLineas).isTrue();
		assertThat(hasAnunav).isTrue();
	}
}
