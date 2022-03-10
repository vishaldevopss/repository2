
package devopsgroup;

import javax.jws.WebService;

@WebService(endpointInterface = "devopsgroup.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

