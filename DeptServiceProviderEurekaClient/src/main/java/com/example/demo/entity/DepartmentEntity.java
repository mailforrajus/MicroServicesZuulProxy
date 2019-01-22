package com.example.demo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DepartmentEntity {
	@XmlElement
	private int deptId;

	@XmlElement
	private String deptName;

	public DepartmentEntity() {
		super();
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public DepartmentEntity(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

}
