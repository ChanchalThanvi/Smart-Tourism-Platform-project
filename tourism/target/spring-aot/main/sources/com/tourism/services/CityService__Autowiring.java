package com.tourism.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CityService}.
 */
@Generated
public class CityService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CityService apply(RegisteredBean registeredBean, CityService instance) {
    AutowiredFieldValueResolver.forRequiredField("cityRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
