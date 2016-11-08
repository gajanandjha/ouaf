package com.tcs.gosi.pojo;

public class M1_GetDeploymentListREST {

	public M1_GetDeploymentListREST() {
		super();
		input = new input();
		output = new output();
	}
	
	private input input;
	private output output;

	public input getInput() {
		return input;
	}

	public void setInput(input input) {
		this.input = input;
	}
	
	public output getOutput() {
		return output;
	}

	public void setOutput(output output) {
		this.output = output;
	}

}
