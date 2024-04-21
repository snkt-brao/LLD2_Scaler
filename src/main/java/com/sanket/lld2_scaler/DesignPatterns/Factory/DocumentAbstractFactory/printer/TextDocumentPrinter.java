package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.printer;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter{
    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
