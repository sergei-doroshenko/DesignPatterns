package org.sergei.design_patterns.replace_if_else.strategy;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class UsSeniorNewbieDeveloperStrategy implements ApplicantStrategy {
    private final Applicant applicant;

    public UsSeniorNewbieDeveloperStrategy(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public Long compute() {
        return (long) (applicant.getAmount() * 1.5);
    }
}
