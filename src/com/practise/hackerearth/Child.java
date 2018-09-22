/**
 * 
 */
package com.practise.hackerearth;

/**
 * @author sonali
 *
 */
public class Child extends Parent{
	
	public static void printMe() {
		System.out.println("******Child******");
	}
	
	
	public static void main(String[] args) {
//		Parent p = new Parent();
//		Child c = new Child();
		Parent p1 = new Child();
//		p.printMe();
//		c.printMe();
		p1.printMe();
	}

}
