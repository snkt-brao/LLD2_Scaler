package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.EfficientInvoiceGeneration;

import com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.User.ClonableObject;

public class Invoice implements ClonableObject {
    private Long invoiceId;
    private String customerName;
    private Double amount;
    private String paymentMethod;
    private InvoiceType type;

    public Invoice(Long invoiceId, String customerName, Double amount, String paymentMethod, InvoiceType type) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.type = type;
    }

    public Invoice(Invoice invoice) {
        this.invoiceId = invoice.invoiceId;
        this.customerName = invoice.customerName;
        this.amount = invoice.amount;
        this.paymentMethod = invoice.paymentMethod;
        this.type = invoice.type;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public InvoiceType getType() {
        return type;
    }

    public void setType(InvoiceType type) {
        this.type = type;
    }

    @Override
    public Invoice cloneObject() {
        return new Invoice(this);
    }
}
