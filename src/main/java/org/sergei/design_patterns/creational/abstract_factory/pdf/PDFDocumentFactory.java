package org.sergei.design_patterns.creational.abstract_factory.pdf;

import org.sergei.design_patterns.creational.abstract_factory.AbstractDocumentFactory;
import org.sergei.design_patterns.creational.abstract_factory.AbstractLetter;
import org.sergei.design_patterns.creational.abstract_factory.AbstractResume;

/**
 * Created by Sergei on 14.08.2015.
 */
public class PDFDocumentFactory implements AbstractDocumentFactory {
    @Override
    public AbstractLetter createLetter() {
        return new PDFLetter();
    }

    @Override
    public AbstractResume createResume() {
        return new PDFResume();
    }
}
