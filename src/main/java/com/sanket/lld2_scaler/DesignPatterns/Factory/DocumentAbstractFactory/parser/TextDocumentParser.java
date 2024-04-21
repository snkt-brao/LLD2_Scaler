package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    @Override
    public void parseDocument() {
        System.out.println(getPath() + " is now parsed as text document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
