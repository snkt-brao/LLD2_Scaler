package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.printer;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter{

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

}
