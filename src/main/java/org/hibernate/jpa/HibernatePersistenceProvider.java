package org.hibernate.jpa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.spi.PersistenceProvider;
import jakarta.persistence.spi.PersistenceUnitInfo;
import jakarta.persistence.spi.ProviderUtil;

import java.util.Map;

public class HibernatePersistenceProvider implements PersistenceProvider {
    @Override
    public EntityManagerFactory createEntityManagerFactory(String s, Map map) {
        return null;
    }

    @Override
    public EntityManagerFactory createContainerEntityManagerFactory(PersistenceUnitInfo persistenceUnitInfo, Map map) {
        return null;
    }

    @Override
    public void generateSchema(PersistenceUnitInfo persistenceUnitInfo, Map map) {

    }

    @Override
    public boolean generateSchema(String s, Map map) {
        return false;
    }

    @Override
    public ProviderUtil getProviderUtil() {
        return null;
    }
}
