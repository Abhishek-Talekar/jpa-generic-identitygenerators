package com.jgid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "presonal_details")
public class PersonalDetails implements Serializable{
	@Id
	@Column(name = "aadhar_no")
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	protected long aadharNo;
	
	@Column(name = "name")
	protected String name;
	
	@Column(name = "age")
	protected int age;
	
	@Column(name = "blood_group")
	protected String bloodGroup;
	
	@Column(name = "email_id")
	protected String emailId;

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "PersonalDetails [aadharNo=" + aadharNo + ", name=" + name + ", age=" + age + ", bloodGroup="
				+ bloodGroup + ", emailId=" + emailId + "]";
	}
	
	
}
