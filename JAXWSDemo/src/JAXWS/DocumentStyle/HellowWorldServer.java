package JAXWS.DocumentStyle;

import javax.xml.ws.Endpoint;

public class HellowWorldServer {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HellowWorldIMPL());

	}

}
