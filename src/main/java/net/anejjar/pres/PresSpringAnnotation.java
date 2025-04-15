package net.anejjar.pres;

import net.anejjar.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.anejjar");
        IMetier metier = applicationContext.getBean(IMetier.class);
        double res = metier.convertir("MAD", "USD", 500);
        System.out.println("Résultat (Spring Annotation) = " + res);
    }
}