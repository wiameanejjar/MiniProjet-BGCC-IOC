package net.anejjar.pres;

import net.anejjar.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        double res = metier.convertir("USD", "MAD", 100);
        System.out.println("Résultat (Spring XML) = " + res);
    }
}
