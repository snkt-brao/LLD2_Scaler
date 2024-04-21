package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentProcessor;

public class TextDocumentProcessor extends DocumentProcessor {
    private String documentName;

    public TextDocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    public void processDocument() {
        // Implement text document processing logic
        System.out.println("Processing a text document: " + getDocumentName());
        // Additional logic for text document processing
    }
}
