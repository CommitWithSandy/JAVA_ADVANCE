
package org.example.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory factory =
            new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

    public static SessionFactory getFactory() {
        return factory;
    }
}
