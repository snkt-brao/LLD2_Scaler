package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.EfficientInvoiceGeneration;

import com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.User.User;

import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

    HashMap<InvoiceType, Invoice> registry;

    public InvoicePrototypeRegistryImpl() {
        this.registry = new HashMap<>();
    }


    @Override
    public void addPrototype(Invoice invoice) {
        registry.put(invoice.getType(), invoice);
    }

    @Override
    public Invoice getPrototype(Invoice type) {
        return registry.get(type);
    }

    @Override
    public Invoice clone(Invoice type) {
        return registry.get(type).cloneObject();
    }
}
