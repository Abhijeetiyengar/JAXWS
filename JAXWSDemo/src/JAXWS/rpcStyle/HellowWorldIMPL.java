package JAXWS.rpcStyle;

import java.util.HashMap;

import javax.jws.WebService;

@WebService(endpointInterface = "JAXWS.rpcStyle.HelloWorldInterface")
public class HellowWorldIMPL implements HelloWorldInterface {

	@Override
	public String getHelloWorldAsString(String name) {
		System.out.println("Yes i got the request RPC");
		return "Yes I am in RPC";
	}

	@Override
	public HashMap<Long, String> getEmployeMap() {
		// TODO Auto-generated method stub
		HashMap<Long, String> a = new HashMap<Long, String>();		
		a.put(1L, "Abhijeet");
		return a;
	}

}
