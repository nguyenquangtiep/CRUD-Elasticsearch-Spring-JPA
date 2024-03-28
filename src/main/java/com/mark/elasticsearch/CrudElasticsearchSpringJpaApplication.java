package com.mark.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories("com.mark.elasticsearch.repository")
public class CrudElasticsearchSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudElasticsearchSpringJpaApplication.class, args);
	}

}
