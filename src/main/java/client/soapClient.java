package client;

import example.service.Hello;
import example.service.HelloService;

import java.net.MalformedURLException;
import java.net.URL;

public class soapClient
{
    public static void main( String[] args )
    {
        try {
            URL url = new URL("http://localhost:8080/ws/hello?wsdl");
            HelloService service = new HelloService(url);
            Hello port = service.getHelloPort();
            String response = port.bonjour("reyhaneh");
            System.out.println(response);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
    }
}