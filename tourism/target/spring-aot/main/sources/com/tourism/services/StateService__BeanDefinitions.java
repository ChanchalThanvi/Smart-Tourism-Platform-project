package com.tourism.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StateService}.
 */
@Generated
public class StateService__BeanDefinitions {
  /**
   * Get the bean definition for 'stateService'.
   */
  public static BeanDefinition getStateServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StateService.class);
    InstanceSupplier<StateService> instanceSupplier = InstanceSupplier.using(StateService::new);
    instanceSupplier = instanceSupplier.andThen(StateService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
