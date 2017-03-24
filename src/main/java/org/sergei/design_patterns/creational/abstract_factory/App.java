package org.sergei.design_patterns.creational.abstract_factory;

/**
 * App doesn't know about implementations (PDFDocumentFactory and XMLDocumentFactory).
 * We need just interfaces and can put jar with implementations.
 */
public class App {

    public static void main(String[] args) {
        AbstractDocumentFactory factory = FactoryProducer.getFactory(FactoryProducer.FactoryType.PDF);

        AbstractLetter letter0 = factory.createLetter();
        AbstractResume resume0 = factory.createResume();

        System.out.printf("Factory created letter: '%s' and resume: '%s'\n", letter0.getClass().getSimpleName(), resume0.getClass().getSimpleName());

        factory = FactoryProducer.getFactory(FactoryProducer.FactoryType.XML);

        AbstractLetter letter1 = factory.createLetter();
        AbstractResume resume1 = factory.createResume();

        System.out.printf("Factory created letter: '%s' and resume: '%s'\n", letter1.getClass().getSimpleName(), resume1.getClass().getSimpleName());
    }

}
