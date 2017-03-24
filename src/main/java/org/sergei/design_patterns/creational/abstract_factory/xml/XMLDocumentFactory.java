package org.sergei.design_patterns.creational.abstract_factory.xml;

import org.sergei.design_patterns.creational.abstract_factory.AbstractDocumentFactory;
import org.sergei.design_patterns.creational.abstract_factory.AbstractLetter;
import org.sergei.design_patterns.creational.abstract_factory.AbstractResume;

/**
 * Created by Sergei on 14.08.2015.
 */
public class XMLDocumentFactory implements AbstractDocumentFactory {
    @Override
    public AbstractLetter createLetter() {
        return new XMLLetter();
    }

    @Override
    public AbstractResume createResume() {
        return new XMLResume();
    }
}
