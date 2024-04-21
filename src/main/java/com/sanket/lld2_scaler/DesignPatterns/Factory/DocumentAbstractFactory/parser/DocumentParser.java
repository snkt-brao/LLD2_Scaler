package com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.parser;

import com.sanket.lld2_scaler.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;

public abstract class DocumentParser {
    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();
}
