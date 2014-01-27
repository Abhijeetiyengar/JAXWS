package JAXWS.rpcStyle;

import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorldInterface {

	@WebMethod String getHelloWorldAsString(String name);
	
	@WebMethod HashMap<Long, String> getEmployeMap();
	
	
}
