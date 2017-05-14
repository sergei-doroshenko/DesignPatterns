package org.sergei.design_patterns.replace_if_else;

import org.sergei.design_patterns.replace_if_else.context.ApplicantContext;

public class StrategyComputation {
    private final Applicant applicant;

    public StrategyComputation(Applicant applicant) {
        this.applicant = applicant;
    }

    public Long compute() {
        return new ApplicantContext(applicant).getApplicantStrategy().compute();
    }
}
