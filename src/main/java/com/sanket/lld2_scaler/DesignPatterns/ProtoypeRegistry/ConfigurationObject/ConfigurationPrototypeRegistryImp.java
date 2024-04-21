package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.ConfigurationObject;

import java.util.HashMap;

public class ConfigurationPrototypeRegistryImp implements ConfigurationPrototypeRegistry {

    HashMap<ConfigurationType, Configuration> registry;

    public ConfigurationPrototypeRegistryImp() {
        this.registry = new HashMap<>();
    }

    @Override
    public void addPrototype(Configuration configuration) {
        registry.put(configuration.getType(), configuration);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return registry.get(type).cloneObject();
    }
}
