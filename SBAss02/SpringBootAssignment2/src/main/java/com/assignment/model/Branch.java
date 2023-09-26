package com.assignment.model;

/*
 * This is a Bank Branch Model which is used to output the All the Branches of the Bank
 * It has only one property named as branchName
 */

public class Branch {

	private String branchName;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(String branchName) {
		super();
		this.branchName = branchName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + "]";
	}
}
