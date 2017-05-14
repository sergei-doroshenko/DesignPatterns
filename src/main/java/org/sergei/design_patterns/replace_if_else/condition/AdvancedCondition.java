package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class AdvancedCondition implements ApplicantCondition {
    private final ApplicantCondition condition;

    public AdvancedCondition(ApplicantCondition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied() {
        return condition.isSatisfied()
                && getApplicant().getExperience() > 3
                && getApplicant().getExperience() < 5;
    }

    @Override
    public Applicant getApplicant() {
        return condition.getApplicant();
    }
}
