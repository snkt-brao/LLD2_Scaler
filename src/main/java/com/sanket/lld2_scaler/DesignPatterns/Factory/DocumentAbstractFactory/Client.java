package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.Factory.ConcreteDocumentFactory;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.Factory.DocumentFactory;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser.DocumentParser;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.printer.DocumentPrinter;
import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.processor.DocumentProcessor;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        DocumentFactory documentFactory = ConcreteDocumentFactory.getDocumentFactory(DocumentType.TEXT);
        DocumentParser textDocumentParser = documentFactory.getDocumentParserInstance("/etc/Download/file.txt");


        System.out.println(textDocumentParser.supportsType());
        System.out.println(textDocumentParser.getPath());
        textDocumentParser.parseDocument();

        DocumentProcessor documentProcessor = documentFactory.getDocumentProcessorInstance("file.txt");

        System.out.println(documentProcessor.getDocumentName());
        System.out.println(documentProcessor.supportsType());
        documentProcessor.processDocument();

        DocumentPrinter documentPrinter = documentFactory.getDocumentPrinterInstance(documentProcessor);

        documentPrinter.printDocument();

    }
}
