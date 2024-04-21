package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.EfficientInvoiceGeneration;

import com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.User.User;
import com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.User.UserType;

public interface InvoicePrototypeRegistry {
    void addPrototype(Invoice user);

    Invoice getPrototype(Invoice type);

    Invoice clone(Invoice type);
}
