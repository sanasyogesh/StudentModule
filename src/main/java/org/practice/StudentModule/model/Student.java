package org.practice.StudentModule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")	 
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="education")
	private String education;
	
	@Column(name="stream")
	private String stream;
	
	@Column(name="address")
	private String address;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	public Student() {
		super();
	}
	
	public Student(String firstName, String lastName, String gender, String education, String stream, String address,
			String contactNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.education = education;
		this.stream = stream;
		this.address = address;
		this.contactNumber = contactNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", education="
				+ education + ", stream=" + stream + ", address=" + address + ", contactNumber=" + contactNumber + "]";
	}
	
}
