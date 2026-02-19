package com.tourism.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CityService}.
 */
@Generated
public class CityService__BeanDefinitions {
  /**
   * Get the bean definition for 'cityService'.
   */
  public static BeanDefinition getCityServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CityService.class);
    InstanceSupplier<CityService> instanceSupplier = InstanceSupplier.using(CityService::new);
    instanceSupplier = instanceSupplier.andThen(CityService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
