package client;

import proxy.BanqueService;
import proxy.Banquews;
import proxy.Compte;

import java.util.List;

public class client_ws {
    public static void main(String[] args) {
        BanqueService proxy= new Banquews().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDh(580));
        Compte cp= proxy.getcompte(3);
        System.out.println("----------");
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDatecreation());
        System.out.println("----------");
        List<Compte> comptes = proxy.getcomptes();
        comptes.forEach(c->{
            System.out.println("----------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDatecreation());
            System.out.println("----------");
        });
    }
}
