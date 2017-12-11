package org.sergei.design_patterns.replace_if_else.strategy;

import org.sergei.design_patterns.replace_if_else.Applicant;

public interface ApplicantStrategy {
    Long compute(Applicant applicant);
}
