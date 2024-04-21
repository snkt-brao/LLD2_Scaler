package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentProcessor;

public abstract class DocumentProcessor {

    private String documentName;

    public abstract DocumentType supportsType();

    public abstract String getDocumentName();

    public abstract void processDocument();


}
