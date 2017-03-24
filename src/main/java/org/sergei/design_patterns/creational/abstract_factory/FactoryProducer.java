package org.sergei.design_patterns.creational.abstract_factory;

import org.sergei.design_patterns.creational.abstract_factory.pdf.PDFDocumentFactory;
import org.sergei.design_patterns.creational.abstract_factory.xml.XMLDocumentFactory;

public class FactoryProducer {

    enum FactoryType {
        XML, PDF
    }
    //TODO: Implement package lookup instead of hardcoded factory types
    public static final AbstractDocumentFactory getFactory(FactoryType type) {
        switch (type) {
            case PDF: return new PDFDocumentFactory();
            case XML: return new XMLDocumentFactory();
            default: return new PDFDocumentFactory();
        }
    }
}
