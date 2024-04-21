package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser.DocumentParser;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser.TextDocumentParser;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.printer.DocumentPrinter;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.printer.TextDocumentPrinter;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.processor.DocumentProcessor;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentParser getDocumentParserInstance(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter getDocumentPrinterInstance(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor getDocumentProcessorInstance(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

}
