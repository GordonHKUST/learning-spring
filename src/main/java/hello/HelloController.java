package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
    	return "hi";
    }
    
}

// Add the Student class here