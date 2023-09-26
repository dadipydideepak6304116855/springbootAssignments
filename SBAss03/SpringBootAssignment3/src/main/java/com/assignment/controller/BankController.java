package com.assignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

	@RequestMapping("/name")
	public String ShowBankName() {
		return "<h1>The Name of the Bank is SBI.</h1>";
	}
	
	@RequestMapping("/address")
	public String ShowBankAddress() {
		return "<h1>The Bank's Address is in Pune, Maharashtra.</h1>";
	}
}
