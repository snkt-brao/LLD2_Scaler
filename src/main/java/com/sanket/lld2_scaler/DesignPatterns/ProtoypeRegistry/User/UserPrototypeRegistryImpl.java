package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.User;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {

    private Map<UserType, User> registry;

    public UserPrototypeRegistryImpl() {
        this.registry = new HashMap<>();
    }

    @Override
    public void addPrototype(User user) {
        this.registry.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return registry.get(type);
    }

    @Override
    public User clone(UserType type) {
        return registry.get(type).cloneObject();
    }
}
