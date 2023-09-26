package com.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.model.Branch;
import com.assignment.model.Services;

@Controller
public class BankController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	// this endpoint shows all the branches of the bank all over the city and takes
	// bankname as an input.
	@PostMapping("/branches")
	public ModelAndView getBranches(@ModelAttribute("bankname") String bankname) {
		ModelAndView mv = new ModelAndView();
		List<Branch> branches = getMumbaiBranches();
		mv.addObject("branches", branches);
		mv.setViewName("branches");
		return mv;
	}

	// this endpoint shows all the services of the bank and takes bankname as an
	// input.
	@PostMapping("/services")
	public ModelAndView getServices(@ModelAttribute("bankname") String bankname) {
		ModelAndView mv = new ModelAndView();
		List<Services> services = getAllServices();
		mv.addObject("services", services);
		mv.setViewName("services");
		return mv;
	}

	// static entry of all branches of the banks in Mumbai
	private List<Branch> getMumbaiBranches() {
		List<Branch> branches = new ArrayList<Branch>();
		branches.add(new Branch("Worli"));
		branches.add(new Branch("Prabhadevi"));
		branches.add(new Branch("Parel"));
		branches.add(new Branch("Mumbai Central"));
		branches.add(new Branch("Colaba"));
		branches.add(new Branch("Bandra"));
		branches.add(new Branch("Mahim"));
		branches.add(new Branch("Tardeo"));
		branches.add(new Branch("Byculla"));
		branches.add(new Branch("Churchgate"));
		return branches;
	}

	// static entry of all services of banks
	private List<Services> getAllServices() {
		List<Services> services = new ArrayList<Services>();
		services.add(new Services("Checking Accounts"));
		services.add(new Services("Savings Accounts"));
		services.add(new Services("Credit Cards"));
		services.add(new Services("Mortages"));
		services.add(new Services("Auto Loans"));
		services.add(new Services("Personal Loans"));
		services.add(new Services("Investments"));
		services.add(new Services("Online Banking"));
		services.add(new Services("Mobile Banking"));
		services.add(new Services("Business Banking"));
		return services;
	}

}
