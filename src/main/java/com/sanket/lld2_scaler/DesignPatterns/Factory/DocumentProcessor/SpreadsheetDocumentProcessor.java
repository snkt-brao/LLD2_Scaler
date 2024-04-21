package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentProcessor;

public class SpreadsheetDocumentProcessor extends DocumentProcessor {
    private String documentName;

    public SpreadsheetDocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public String getDocumentName() {
        return documentName;
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a spreadsheet document: " + getDocumentName());
    }

    public void performDataAnalysis() {
        System.out.println("Performing data analysis on the spreadsheet.");
    }
}
