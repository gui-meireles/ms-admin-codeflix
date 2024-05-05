package com.admin.codeflix.infrastructure;

import com.admin.codeflix.domain.category.Category;
import com.admin.codeflix.infrastructure.category.persistence.CategoryJpaEntity;
import com.admin.codeflix.infrastructure.category.persistence.CategoryRepository;
import com.admin.codeflix.infrastructure.configuration.WebServerConfig;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(WebServerConfig.class, args);
    }

    @Bean
    public ApplicationRunner runner(CategoryRepository repository) {
        return args -> {
            List<CategoryJpaEntity> all = repository.findAll();

            // Tests
            Category filmes = Category.newCategory("Filmes", null, true);

            repository.saveAndFlush(CategoryJpaEntity.from(filmes));
            repository.deleteAll();
        };
    }
}