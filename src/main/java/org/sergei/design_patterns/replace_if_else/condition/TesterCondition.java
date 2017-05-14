package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class TesterCondition implements ApplicantCondition {
    private final ApplicantCondition condition;

    public TesterCondition(ApplicantCondition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied() {
        return condition.isSatisfied() && getApplicant().getProfession().equals("tester");
    }

    @Override
    public Applicant getApplicant() {
        return condition.getApplicant();
    }
}
