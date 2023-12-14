import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.javarush.lukyanov.hibernateFinal.entity.City;
import ru.javarush.lukyanov.hibernateFinal.entity.Country;
import ru.javarush.lukyanov.hibernateFinal.entity.CountryLanguage;
import ru.javarush.lukyanov.hibernateFinal.repository.CityRepository;

import java.util.List;
import java.util.Set;

public class MySQLDBTest {
    public static CityRepository cityRepository;
    public static Session session = null;
    public static SessionFactory sessionFactory;

    @BeforeAll
    static void setup() {

        sessionFactory = new Configuration()
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(CountryLanguage.class)
                .buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
        cityRepository = new CityRepository(sessionFactory);
    }

    @AfterAll
    static void tearDown() {
        session.getTransaction().commit();
        sessionFactory.close();
    }

    public void testMysqlData(List<Integer> ids) {
        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            for (Integer id : ids) {
                City city = cityRepository.get(id);
                Set<CountryLanguage> languages = city.getCountry().getLanguages();
            }
            session.getTransaction().commit();
        }
    }
}
