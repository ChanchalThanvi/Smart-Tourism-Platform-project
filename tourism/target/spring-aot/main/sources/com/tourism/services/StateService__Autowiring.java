package com.tourism.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link StateService}.
 */
@Generated
public class StateService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static StateService apply(RegisteredBean registeredBean, StateService instance) {
    AutowiredFieldValueResolver.forRequiredField("stateRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
