package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "banquews")
public class banque_service {
    @WebMethod(operationName = "conversion_euro_to_dh")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt*11;
    }
    @WebMethod
    public compte getcompte(@WebParam(name = "code") int code){
        return new compte(code,1000+Math.random()*9000,new Date());
    }
    @WebMethod
    public List<compte> getcomptes() {
        return List.of(new compte(1,1000+Math.random()*9000,new Date())
                ,new compte(2,1000+Math.random()*9000,new Date())
                ,new compte(3,1000+Math.random()*9000,new Date()));
    }
}

