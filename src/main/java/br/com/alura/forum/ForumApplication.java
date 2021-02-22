package br.com.alura.forum;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@Slf4j
@EnableSpringDataWebSupport
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
