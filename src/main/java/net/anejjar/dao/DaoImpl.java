package net.anejjar.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getTaux(String from, String to) {
        if (from.equals("MAD") && to.equals("EUR")) return 0.09;
        if (from.equals("EUR") && to.equals("MAD")) return 11.0;
        return 1;
    }
}