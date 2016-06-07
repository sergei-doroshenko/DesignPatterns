package org.sergei.design_patterns.behavioral.visitor.element;

import org.sergei.design_patterns.behavioral.visitor.visitor.Visitor;

/**
 * Created by Sergei on 30.07.2015.
 */
public interface Element {
    void accept(Visitor visitor);
}
