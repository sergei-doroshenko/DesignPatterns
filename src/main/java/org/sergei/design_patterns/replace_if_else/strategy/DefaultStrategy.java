package org.sergei.design_patterns.replace_if_else.strategy;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class DefaultStrategy implements ApplicantStrategy {
    private final Applicant applicant;

    public DefaultStrategy(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public Long compute() {
        return applicant.getAmount() * 2;
    }
}
