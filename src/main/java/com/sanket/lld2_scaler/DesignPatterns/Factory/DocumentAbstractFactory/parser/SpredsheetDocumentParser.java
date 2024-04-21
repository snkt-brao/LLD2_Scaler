package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;

public class SpredsheetDocumentParser extends DocumentParser {
    public SpredsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        System.out.println(getPath() + " is now parsed as text document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
