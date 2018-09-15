package pl.ies.dao;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import pl.ies.entity.Hardware;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Component
@Transactional
public class HardwareDao {
    @PersistenceContext
    EntityManager entityManager;
    public void save(Hardware entity){entityManager.persist(entity);}
    public void update(Hardware entity){entityManager.merge(entity);}
    public void delete(Hardware entity){
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
