/**
 * File Name: Employee.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor<br>
 * Created: Nov 30, 2015
 */
package com.sqa.sk.employees;

/**
 * Employee //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class Employee {

	private String address;

	private String age;

	private String jobTitle;

	private String name;

	public Employee(String name, String address, String age, String jobTitle) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getAddress() {
		return this.address;
	}

	public String getAge() {
		return this.age;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public String getName() {
		return this.name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", address=" + this.address + ", age=" + this.age + ", jobTitle="
				+ this.jobTitle + "]";
	}
}
