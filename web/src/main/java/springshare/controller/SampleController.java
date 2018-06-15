package springshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springshare.SampleService;

import javax.annotation.PostConstruct;

@Service("sampleController")
public class SampleController implements SampleService {

    /** Le service **/
    @Autowired
    private SampleService sampleService;

    @PostConstruct
    private void init(){
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("------SampleController initiated------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

    }

    public String sayHello(String greeting) {
        return sampleService.sayHello(greeting);
    }

}
