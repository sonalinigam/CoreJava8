package com.practise.hackerearth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestImmutable {
	
	private Employee emp;
	private MyImmutableClass obj;
	private String name;
	
	@BeforeEach
	public void setUp() {
		emp = new Employee("1099", new Integer(31));
		name = "Sonali";
		obj = new MyImmutableClass(name, emp);
	}

	@Test
	void testName() {
		name = "Priyankesh";  // Trying to mutate String name
		assertEquals("Sonali", obj.getName());
	}
	
	@Test
	void testId() {
		emp.setId("2099"); // Mutating Employee's id
		assertEquals("1099", obj.getEmp().getId());
	}
	
	@Test
	void testAge() {
		emp.setAge(35); // Mutating Employee's age
		assertEquals(new Integer(31), obj.getEmp().getAge());
	}
}