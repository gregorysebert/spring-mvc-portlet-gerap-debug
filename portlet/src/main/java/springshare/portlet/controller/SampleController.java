package springshare.portlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "VIEW")
public class SampleController {
    /** Le service **/
    @Autowired
    private SampleService sampleService;

    @PostConstruct
    private void init(){
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("------SampleController Portlet initiated------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
    }

    @RenderMapping
    public ModelAndView showHome(Model currentModel, RenderRequest request) {
        System.out.println("Rendering home jsp " + sampleService.sayHello("from Portlet rendering"));
        Map<String, Object> model = new HashMap<String, Object>();
        return new ModelAndView("home", model);
    }
}
