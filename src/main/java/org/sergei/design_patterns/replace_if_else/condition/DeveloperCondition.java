package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class DeveloperCondition implements Condition<Applicant> {
    private final Condition<Applicant> condition;

    public DeveloperCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied(Applicant applicant) {
        return this.condition.isSatisfied(applicant)
                && ("developer").equals(applicant.getProfession());
    }
}
