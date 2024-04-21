package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.User;

public interface UserPrototypeRegistry {
    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
