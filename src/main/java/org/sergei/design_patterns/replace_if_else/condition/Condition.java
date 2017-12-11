package org.sergei.design_patterns.replace_if_else.condition;

public interface Condition<T> {
    Condition ALWAYS_TRUE = new Condition() {
        @Override
        public Boolean isSatisfied(Object subject) {
            return true;
        }
    };

    Boolean isSatisfied(T subject);
}
