package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.ModelBase;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;
import java.util.Optional;

public class GenericSpRepositoryImpl<TEntity extends ModelBase> extends SimpleJpaRepository<TEntity, Long> implements GenericSpRepository<TEntity> {

    private EntityManager entityManager;
    private Class<TEntity> clase;

    public GenericSpRepositoryImpl(JpaEntityInformation<TEntity, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<TEntity> findAll() {
        String className = this.clase.getSimpleName();
        String methodName = "findAll";
        String storedProcedureName = String.format("%s_%s", className, methodName);

        StoredProcedureQuery storedProcedure = this.entityManager.createStoredProcedureQuery(storedProcedureName, clase);
        return storedProcedure.getResultList();
    }

    @Override
    public Optional<TEntity> findById(Long id) {
        String className = this.clase.getSimpleName();
        String methodName = "findById";
        String storedProcedureName = String.format("%s_%s", className, methodName);

        StoredProcedureQuery storedProcedure = this.entityManager.createStoredProcedureQuery(storedProcedureName, clase).
                registerStoredProcedureParameter(1, Long.class, ParameterMode.IN)
                .setParameter(1, id);

        return Optional.ofNullable((TEntity)storedProcedure.getSingleResult());
    }

    @Override
    public void deleteById(Long id) {
    }

    public void setTClass(Class<TEntity> clase) {
        this.clase = clase;
    }
}
