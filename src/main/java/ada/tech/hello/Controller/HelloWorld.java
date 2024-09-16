package ada.tech.hello.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("alive")
    @ResponseBody
    public String alive(){return "It's aliiive!";}

}
