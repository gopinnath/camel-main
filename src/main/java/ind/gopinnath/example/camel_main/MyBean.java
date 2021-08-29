package ind.gopinnath.example.camel_main;

import java.util.Arrays;
import java.util.List;

import org.apache.camel.Exchange;

public class MyBean {

    private String hi;
    private String bye;

    public MyBean(String hi, String bye) {
        this.hi = hi;
        this.bye = bye;
    }

    public String hello() {
        return hi + " how are you?";
    }

    public String bye() {
        return bye + " World";
    }
    
    public List<String> countries() {
    	return Arrays.asList("USA,Canada" ,"India" , "Rest of the World");
    }
    
    public String greetCountry(Exchange exchange) {
        return exchange.getMessage().getBody() + " how are you?";
    }
}
