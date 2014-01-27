package JAXWS.DocumentStyle;

import javax.jws.WebService;

@WebService(endpointInterface = "JAXWS.DocumentStyle.HelloWorldInterface")
public class HellowWorldIMPL implements HelloWorldInterface {

	@Override
	public String getHelloWorldAsString(String name) {
		System.out.println("Yes i got the request");
		return "Yes I am in";
	}

}
