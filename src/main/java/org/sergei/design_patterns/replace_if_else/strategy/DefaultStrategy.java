package org.sergei.design_patterns.replace_if_else.strategy;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class DefaultStrategy implements ApplicantStrategy {

    @Override
    public Long compute(Applicant applicant) {
        return applicant.getAmount() * 2;
    }
}
