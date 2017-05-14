package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class SeniorCondition implements ApplicantCondition {
    private final ApplicantCondition condition;

    public SeniorCondition(ApplicantCondition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied() {
        return condition.isSatisfied() && getApplicant().getAge() > 30;
    }

    @Override
    public Applicant getApplicant() {
        return condition.getApplicant();
    }
}
