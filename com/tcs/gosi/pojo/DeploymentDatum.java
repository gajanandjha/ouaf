package com.tcs.gosi.pojo;

public class DeploymentDatum {

	public DeploymentDatum() {
		// TODO Auto-generated constructor stub
	}
	
	private String deploymentId;
	private String deploymentTypeCode;
	private String deploymentDescription;
	private String deploymentStatus;
	
	public String getDeploymentId() {
		return deploymentId;
	}
	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}
	public String getDeploymentTypeCode() {
		return deploymentTypeCode;
	}
	public void setDeploymentTypeCode(String deploymentTypeCode) {
		this.deploymentTypeCode = deploymentTypeCode;
	}
	public String getDeploymentDescription() {
		return deploymentDescription;
	}
	public void setDeploymentDescription(String deploymentDescription) {
		this.deploymentDescription = deploymentDescription;
	}
	public String getDeploymentStatus() {
		return deploymentStatus;
	}
	public void setDeploymentStatus(String deploymentStatus) {
		this.deploymentStatus = deploymentStatus;
	}

}
