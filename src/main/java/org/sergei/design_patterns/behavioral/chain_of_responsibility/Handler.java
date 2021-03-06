package org.sergei.design_patterns.behavioral.chain_of_responsibility;

/**
 * Created by Sergei on 10.09.2015.
 */
public interface Handler {
    void handle(Long number);

    void setNext(Handler handler);
}
