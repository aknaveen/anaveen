/**
 * 
 */
package com.example.jaxrs.service;

import com.example.jaxrs.model.Person;
import com.example.jaxrs.model.Response;

/**
 * @author Aknaveen
 *
 */
public interface PersonService {
	
	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
}
