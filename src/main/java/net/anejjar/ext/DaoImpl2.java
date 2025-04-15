package net.anejjar.ext;

import net.anejjar.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getTaux(String from, String to) {
        if (from.equals("MAD") && to.equals("USD")) return 0.10;
        if (from.equals("USD") && to.equals("MAD")) return 10.5;
        return 1;
    }
}
