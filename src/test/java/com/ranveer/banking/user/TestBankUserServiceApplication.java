package com.ranveer.banking.user;

import org.springframework.boot.SpringApplication;

public class TestBankUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(BankUserServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
