package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class AdvancedCondition implements Condition<Applicant> {
    private Condition<Applicant> condition;

    public AdvancedCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public Boolean isSatisfied(Applicant applicant) {
        return this.condition.isSatisfied(applicant)
                && applicant.getExperience() > 3
                && applicant.getExperience() < 5;
    }
}
