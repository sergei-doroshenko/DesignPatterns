package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class USCondition implements Condition<Applicant> {
    private final Condition<Applicant> condition;

    public USCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied(Applicant applicant) {
        return this.condition.isSatisfied(applicant) && ("US").equals(applicant.getCountry());
    }
}
