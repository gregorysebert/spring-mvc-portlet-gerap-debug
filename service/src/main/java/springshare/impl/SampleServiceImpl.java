package springshare.impl;

import org.springframework.stereotype.Service;
import springshare.SampleService;

import javax.annotation.PostConstruct;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {

    @PostConstruct
    private void init(){
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("------SampleService created------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

    }

    public String sayHello(String greeting) {
      return "Hello "+greeting+" from " + this.toString();
   }

}
