package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentProcessor;

public class DocumentProcessorFactory {
    public static DocumentProcessor getDocumentProcessor(DocumentType type, String name) throws Exception {
        switch (type) {
            case TEXT -> new TextDocumentProcessor(name);
            case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(name);
            case PRESENTATION -> new PresentationDocumentProcessor(name);
        }

        return null;
    }
}
