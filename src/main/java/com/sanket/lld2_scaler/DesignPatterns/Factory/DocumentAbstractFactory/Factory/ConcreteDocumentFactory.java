package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;

import java.io.IOException;

public class ConcreteDocumentFactory {
    public static DocumentFactory getDocumentFactory(DocumentType type) throws IOException {
        switch (type) {
            case TEXT -> {
                return new TextDocumentFactory();
            }
            case SPREAD_SHEET -> {
                return new SpreadsheetDocumentFactory();
            }
            default -> {
                throw new IOException("Invalid document type");
            }
        }
    }
}
