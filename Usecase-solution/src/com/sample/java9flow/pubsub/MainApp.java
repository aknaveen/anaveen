/**
 * 
 */
package com.sample.java9flow.pubsub;

/**
 * @author Naveen Ak
 * Reactive programming using java.util.concurrent.Flow api
 */
public class MainApp {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		MyPublisher publisher = new MyPublisher();
		MySubscriber subscriberA = new MySubscriber("A");
		MySubscriber subscriberB = new MySubscriber("B");
		
		publisher.subscribe(subscriberA);
		publisher.subscribe(subscriberB);
		
		publisher.waitUntilTerminated();

	}

}
