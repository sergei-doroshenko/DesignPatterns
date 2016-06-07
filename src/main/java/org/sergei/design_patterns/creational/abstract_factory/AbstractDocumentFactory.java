package org.sergei.design_patterns.creational.abstract_factory;

/**
 * Created by Sergei on 14.08.2015.
 */
public interface AbstractDocumentFactory {
    AbstractLetter createLetter();
    AbstractResume createResume();
}
