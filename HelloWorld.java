import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index(){
        String s = "Hello World";
        return s;
    }

    @RequestMapping("/test")
    public String index(){
        String s = "Hello World test";
        return s;
    }
  
}
