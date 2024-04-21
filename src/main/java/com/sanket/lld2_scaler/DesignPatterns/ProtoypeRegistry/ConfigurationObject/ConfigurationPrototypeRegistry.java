package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.ConfigurationObject;

public interface ConfigurationPrototypeRegistry {
    void addPrototype(Configuration user);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type);
}
