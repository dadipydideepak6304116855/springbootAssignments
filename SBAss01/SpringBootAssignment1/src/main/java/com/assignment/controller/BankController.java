package com.assignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//This annotation returns the data instead of returning a logical view.
@RestController
@RequestMapping("/bank")
public class BankController {

	//this endpoint outputs the bank Name as a String.
	@RequestMapping("/name")
	public String ShowBankName() {
		return "<h1>The Name of the Bank is Bank of India.</h1>";
	}
	
	//this endpoint outputs the bank Address as a String.
	@RequestMapping("/address")
	public String ShowBankAddress() {
		return "<h1>The Bank's Address is in Mumbai, Maharashtra.</h1>";
	}
}
