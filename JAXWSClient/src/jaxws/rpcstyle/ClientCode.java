package jaxws.rpcstyle;

import java.net.URI;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ClientCode {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://rpcStyle.JAXWS/", "HellowWorldIMPLService");
 
        Service service = Service.create(url, qname);
 
        HelloWorldInterface hello = service.getPort(HelloWorldInterface.class);
 
         System.out.println(hello.getHelloWorldAsString("Abhijeet"));
         
         System.out.println(hello.getEmployeMap());        


	}

}
