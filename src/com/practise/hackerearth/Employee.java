/**
 * 
 */
package com.practise.hackerearth;

/**
 * @author sonali
 *
 */
public class Employee {
	
	private String id;
	private Integer age;
	
	public Employee(String id, Integer age) {
		this.id = id;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
