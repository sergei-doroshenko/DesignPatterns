package org.sergei.design_patterns.behavioral.visitor;

import org.sergei.design_patterns.behavioral.visitor.element.Element;
import org.sergei.design_patterns.behavioral.visitor.element.ElementA;
import org.sergei.design_patterns.behavioral.visitor.element.ElementB;
import org.sergei.design_patterns.behavioral.visitor.visitor.Visitor;
import org.sergei.design_patterns.behavioral.visitor.visitor.VisitorA;
import org.sergei.design_patterns.behavioral.visitor.visitor.VisitorB;

/**
 * Created by Sergei on 30.07.2015.
 */
public class App {
    public static void main(String[] args) {

        Visitor visitor = new VisitorA();

        Element e0 = new ElementA();
        e0.accept(visitor);

        Element e1 = new ElementB();
        e1.accept(visitor);

        Visitor visitorB = new VisitorB();
        e0.accept(visitorB);
        e1.accept(visitorB);
    }
}
