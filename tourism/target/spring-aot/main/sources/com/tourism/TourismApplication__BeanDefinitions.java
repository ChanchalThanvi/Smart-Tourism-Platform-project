package com.tourism;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TourismApplication}.
 */
@Generated
public class TourismApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'tourismApplication'.
   */
  public static BeanDefinition getTourismApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TourismApplication.class);
    beanDefinition.setInstanceSupplier(TourismApplication::new);
    return beanDefinition;
  }
}
