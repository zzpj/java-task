package com.example.sprintly;

import com.example.sprintly.model.User;
import com.example.sprintly.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SprintlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintlyApplication.class, args);
	}

	@Bean
	public CommandLineRunner userInitializer(UserService userService) {
		return args -> {
			User user1 = User.builder()
					.name("Jan Kowalski")
					.email("jan.kowalski@example.com")
					.role("USER")
					.password("haslo123")
					.build();

			User user2 = User.builder()
					.name("Anna Nowak")
					.email("anna.nowak@example.com")
					.role("ADMIN")
					.password("haslo456")
					.build();

			User user3 = User.builder()
					.name("Piotr Zielinski")
					.email("piotr.zielinski@example.com")
					.role("USER")
					.password("haslo789")
					.build();

			User user4 = User.builder()
					.name("Katarzyna Wójcik")
					.email("katarzyna.wojcik@example.com")
					.role("USER")
					.password("haslo321")
					.build();

			User user5 = User.builder()
					.name("Marek Lewandowski")
					.email("marek.lewandowski@example.com")
					.role("ADMIN")
					.password("haslo654")
					.build();

			userService.saveAllUsers(Arrays.asList(user1, user2, user3, user4, user5));
		};
	}

}
