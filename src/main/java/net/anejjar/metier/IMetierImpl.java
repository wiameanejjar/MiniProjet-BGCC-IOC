package net.anejjar.metier;

import net.anejjar.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {

    // Injection par champ
    @Autowired
    private IDao dao;

    // Injection par constructeur
    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    // Injection par setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double convertir(String from, String to, double montant) {
        double taux = dao.getTaux(from, to);
        return montant * taux;
    }
}