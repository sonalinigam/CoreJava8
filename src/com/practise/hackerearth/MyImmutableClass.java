/**
 * 
 */
package com.practise.hackerearth;

/**
 * @author sonali
 *
 */
public final class MyImmutableClass {

	public final String name;
	public final Employee emp;
	
	public MyImmutableClass(String name, Employee emp) {
		this.name = name;
		this.emp = new Employee(emp.getId(), emp.getAge());
	}

	public String getName() {
		return name;
	}

	public Employee getEmp() {
		return emp;
	}
	
}
