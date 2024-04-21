package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser.DocumentParser;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.printer.DocumentPrinter;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentType supportsType();

    public abstract DocumentParser getDocumentParserInstance(String path);

    public abstract DocumentPrinter getDocumentPrinterInstance(DocumentProcessor processor);

    public abstract DocumentProcessor getDocumentProcessorInstance(String documentName);

}
