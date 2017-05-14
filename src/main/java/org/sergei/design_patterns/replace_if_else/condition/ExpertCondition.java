package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class ExpertCondition implements ApplicantCondition {
    private final ApplicantCondition condition;

    public ExpertCondition(ApplicantCondition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied() {
        return condition.isSatisfied() && getApplicant().getExperience() > 5;
    }

    @Override
    public Applicant getApplicant() {
        return condition.getApplicant();
    }
}
