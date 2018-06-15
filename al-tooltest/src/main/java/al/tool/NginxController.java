package al.tool;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class NginxController {
	
	@RequestMapping("/index")
	public String index(Map<String, Object> map) {
	    map.put("name","Welcome to Nginx!");
	   return "nginx-welcome";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(NginxController.class, args);
	}
}
