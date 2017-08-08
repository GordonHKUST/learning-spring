package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
    
	@Autowired
	private SomeSpringBean myBean;
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!" + myBean.getCounter();
//    	return "hi";
    }
    
    @RequestMapping(value="/hi", method=RequestMethod.POST)
    public Student sayHiToStudent(@RequestParam(value="parameter1", defaultValue="Kevin") String name,
    		@RequestParam(value="parameter2", defaultValue="") String who 
    ) {
    	return new Student(name + " " + who, 3);
    }
}

class Student {
	private String name;
	private int year;
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
}