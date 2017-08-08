package hello;

import org.springframework.stereotype.Component;

@Component
public class SomeSpringBean {
	
	private int counter = 0;
	
	public int getCounter() {return counter++;} 
	
}