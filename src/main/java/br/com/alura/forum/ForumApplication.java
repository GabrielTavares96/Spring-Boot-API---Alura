package br.com.alura.forum;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Slf4j
@EnableSpringDataWebSupport
@EnableCaching
@EnableSwagger2
public class ForumApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.trace("Logging at TRACE level");
		log.debug("Logging at DEBUG level");
		log.info("Logging at INFO level");
		log.warn("Logging at WARN level");
		log.error("Logging at ERROR level");
	}
}
