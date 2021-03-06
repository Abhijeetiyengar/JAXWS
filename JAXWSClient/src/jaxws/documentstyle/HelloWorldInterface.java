
package jaxws.documentstyle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldInterface", targetNamespace = "http://DocumentStyle.JAXWS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldInterface {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHelloWorldAsString", targetNamespace = "http://DocumentStyle.JAXWS/", className = "jaxws.documentstyle.GetHelloWorldAsString")
    @ResponseWrapper(localName = "getHelloWorldAsStringResponse", targetNamespace = "http://DocumentStyle.JAXWS/", className = "jaxws.documentstyle.GetHelloWorldAsStringResponse")
    @Action(input = "http://DocumentStyle.JAXWS/HelloWorldInterface/getHelloWorldAsStringRequest", output = "http://DocumentStyle.JAXWS/HelloWorldInterface/getHelloWorldAsStringResponse")
    public String getHelloWorldAsString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
