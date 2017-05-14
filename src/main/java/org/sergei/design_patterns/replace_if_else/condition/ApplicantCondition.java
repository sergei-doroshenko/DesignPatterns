package org.sergei.design_patterns.replace_if_else.condition;

import org.sergei.design_patterns.replace_if_else.Applicant;

public interface ApplicantCondition extends Condition {
    Applicant getApplicant();
}
