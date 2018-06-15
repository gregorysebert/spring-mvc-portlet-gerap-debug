package springshare.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import springshare.SampleService;

import javax.annotation.PostConstruct;
import javax.portlet.RenderRequest;
import java.util.HashMap;
import java.util.Map;

/** Controleur retrait partiel en euros. */
@Controller("sampleController")
public class SampleController {
    /** Le service **/
    @Autowired
    private SampleService sampleService;

    @PostConstruct
    private void init(){
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("------SampleController MVC initiated------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
    }

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        System.out.println("Rendering home MVC " + sampleService.sayHello("from Portlet rendering"));
        return new ModelAndView("welcome", "message", sampleService.sayHello("from Portlet rendering"));
    }
}
