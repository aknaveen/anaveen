/**
 * 
 */
package com.example.jaxrs.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Aknaveen
 *
 */

@XmlRootElement
public class Response {
	private boolean status;
	private String message;
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
