package in.balakumar.HelloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SayHello {

    @RequestMapping(path="/hello", method= RequestMethod.GET)
    public String hello() {
        return "Hello World (changed) ! - BK";
    }
}
