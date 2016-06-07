package org.sergei.design_patterns.behavioral.visitor.visitor;

import org.sergei.design_patterns.behavioral.visitor.element.ElementA;
import org.sergei.design_patterns.behavioral.visitor.element.ElementB;

/**
 * Created by Sergei on 30.07.2015.
 */
public class VisitorB implements Visitor {

    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("VisitorB operate ElementA");
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("VisitorB operate ElementB");
    }
}
