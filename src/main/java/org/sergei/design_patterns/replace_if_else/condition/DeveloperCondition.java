package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class DeveloperCondition implements ApplicantCondition {
    private final ApplicantCondition condition;

    public DeveloperCondition(ApplicantCondition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied() {
        return condition.isSatisfied() && getApplicant().getProfession().equals("developer");
    }

    @Override
    public Applicant getApplicant() {
        return condition.getApplicant();
    }
}
