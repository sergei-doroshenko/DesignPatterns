package org.sergei.design_patterns.replace_if_else.strategy;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class UsSeniorAdvancedDeveloperStrategy implements ApplicantStrategy {
    private final Applicant applicant;

    public UsSeniorAdvancedDeveloperStrategy(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public Long compute() {
        return (long) (applicant.getAmount() * 1.1);
    }
}
