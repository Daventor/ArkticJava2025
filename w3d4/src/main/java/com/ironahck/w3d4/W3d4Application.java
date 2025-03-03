package com.ironahck.w3d4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class W3d4Application implements CommandLineRunner {
	@Autowired
	Menu menu;

	public static void main(String[] args) {
		SpringApplication.run(W3d4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		menu.menuCommands();
	}
}
