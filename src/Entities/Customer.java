package Entities;

import java.time.LocalDate;

public class Customer {
	public String firstName;
	public String lastName;
	public LocalDate DateofBirth;
	public long NationalityId;
	
	public Customer() {
		
	}
	public Customer(String firstName, String lastName, LocalDate dateofBirth, long nationalityId) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		DateofBirth = dateofBirth;
		NationalityId = nationalityId;
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
	public LocalDate getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public long getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}

	
}
