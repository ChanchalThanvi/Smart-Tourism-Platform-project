package com.tourism.repository;

import com.tourism.entity.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link CityRepository}.
 */
@Generated
public class CityRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public CityRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link CityRepository#findByStateId(java.lang.Long)}.
   */
  public List<City> findByStateId(Long stateId) {
    String queryString = "SELECT c FROM City c WHERE c.state.id = :stateId";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("stateId", stateId);

    return (List<City>) query.getResultList();
  }
}
