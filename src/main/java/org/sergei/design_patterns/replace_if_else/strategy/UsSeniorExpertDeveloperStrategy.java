package org.sergei.design_patterns.replace_if_else.strategy;

import org.sergei.design_patterns.replace_if_else.Applicant;

public class UsSeniorExpertDeveloperStrategy implements ApplicantStrategy {

    @Override
    public Long compute(Applicant applicant) {
        return (long) (applicant.getAmount() * 1.03);
    }
}
