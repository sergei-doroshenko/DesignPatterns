package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class NewbieCondition implements ApplicantCondition {
    private final ApplicantCondition condition;

    public NewbieCondition(ApplicantCondition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied() {
        return condition.isSatisfied() && getApplicant().getExperience() >= 1;
    }

    @Override
    public Applicant getApplicant() {
        return condition.getApplicant();
    }
}
