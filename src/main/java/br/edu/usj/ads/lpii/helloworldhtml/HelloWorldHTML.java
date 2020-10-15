package br.edu.usj.ads.lpii.helloworldhtml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldHTML {
    
    @GetMapping(value="/hello")
    public ModelAndView getHelloWolrdHTML( ) {
        ModelAndView modelAndView = new ModelAndView("hello-world");
        return modelAndView;
    }
       

}
