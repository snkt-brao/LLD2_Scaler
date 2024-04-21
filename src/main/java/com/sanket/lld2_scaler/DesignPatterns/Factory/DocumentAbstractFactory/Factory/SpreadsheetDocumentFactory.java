package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser.DocumentParser;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser.SpredsheetDocumentParser;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.printer.DocumentPrinter;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.printer.SpreadsheetDocumentPrinter;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.processor.DocumentProcessor;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser getDocumentParserInstance(String path) {
        return new SpredsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter getDocumentPrinterInstance(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor getDocumentProcessorInstance(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

}
