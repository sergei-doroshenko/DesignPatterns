package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class USCondition implements ApplicantCondition {
    private final Applicant applicant;

    public USCondition(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public Boolean isSatisfied() {
        return applicant.getCountry().equals("US");
    }

    @Override
    public Applicant getApplicant() {
        return applicant;
    }
}
