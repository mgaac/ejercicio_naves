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
		boolean hasNaves = entityManager.getMetamodel().getEntities().stream().map(EntityType::getName).anyMatch(n -> n.equals("Naves"));
		boolean hasLineas = entityManager.getMetamodel().getEntities().stream().map(EntityType::getName).anyMatch(n -> n.equals("Lineas"));
		boolean hasAnunav = entityManager.getMetamodel().getEntities().stream().map(EntityType::getName).anyMatch(n -> n.equals("Anunav"));
		assertThat(hasNaves).isTrue();
		assertThat(hasLineas).isTrue();
		assertThat(hasAnunav).isTrue();
	}
}
