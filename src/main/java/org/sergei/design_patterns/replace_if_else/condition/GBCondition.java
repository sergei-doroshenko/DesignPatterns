package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class GBCondition implements ApplicantCondition {
    private final Applicant applicant;

    public GBCondition(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public Boolean isSatisfied() {
        return applicant.getCountry().equals("GB");
    }

    @Override
    public Applicant getApplicant() {
        return applicant;
    }
}
