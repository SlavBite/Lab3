package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Создание реестра сервисов Hibernate
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();
            // Создание метаданных Hibernate из реестра сервисов
            Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
            // Создание фабрики сессий Hibernate из метаданных
            return metadata.getSessionFactoryBuilder().build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("Исключение при создании фабрики сессий Hibernate");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Закрытие фабрики сессий Hibernate
        getSessionFactory().close();
    }
}
