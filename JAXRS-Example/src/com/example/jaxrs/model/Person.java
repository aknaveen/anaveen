/**
 * 
 */
package com.example.jaxrs.model;

/**
 * @author Aknaveen
 *
 */

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name="person")
public class Person {
	private String name;
	private int age;
	private int id;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return id+"::"+name+"::"+age;
	}
}
