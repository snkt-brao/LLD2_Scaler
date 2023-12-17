package com.sanket.lld2_scaler.SOLID.OnlineStore.Solution;

import lombok.Getter;

@Getter
public class OnlineStore {

    private final ProductCatalog productCatalog;
    private final InvoicePrinter invoicePrinter;

    public OnlineStore() {
        productCatalog = new ProductCatalog();
        invoicePrinter = new InvoicePrinter(productCatalog);
    }

    public Cart createCart() {
        return new Cart(productCatalog);
    }

    public void printInvoice(Cart cart) {
        invoicePrinter.printInvoice(cart);
    }
}
