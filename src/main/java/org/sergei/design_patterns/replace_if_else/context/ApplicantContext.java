package org.sergei.design_patterns.replace_if_else.context;

import org.sergei.design_patterns.replace_if_else.Applicant;
import org.sergei.design_patterns.replace_if_else.condition.AdvancedCondition;
import org.sergei.design_patterns.replace_if_else.condition.Condition;
import org.sergei.design_patterns.replace_if_else.condition.DeveloperCondition;
import org.sergei.design_patterns.replace_if_else.condition.ExpertCondition;
import org.sergei.design_patterns.replace_if_else.condition.GBCondition;
import org.sergei.design_patterns.replace_if_else.condition.NewbieCondition;
import org.sergei.design_patterns.replace_if_else.condition.SeniorCondition;
import org.sergei.design_patterns.replace_if_else.condition.TesterCondition;
import org.sergei.design_patterns.replace_if_else.condition.USCondition;
import org.sergei.design_patterns.replace_if_else.strategy.ApplicantStrategy;
import org.sergei.design_patterns.replace_if_else.strategy.DefaultStrategy;
import org.sergei.design_patterns.replace_if_else.strategy.GbSeniorAdvancedTesterStrategy;
import org.sergei.design_patterns.replace_if_else.strategy.UsSeniorNewbieDeveloperStrategy;
import org.sergei.design_patterns.replace_if_else.strategy.UsSeniorAdvancedDeveloperStrategy;
import org.sergei.design_patterns.replace_if_else.strategy.UsSeniorExpertDeveloperStrategy;

import java.util.HashMap;
import java.util.Map;

public class ApplicantContext {
    private final Applicant applicant;
    private Map<Condition, ApplicantStrategy> strategyMap = new HashMap<>();

    public ApplicantContext(Applicant applicant) {
        this.applicant = applicant;
    }

    public ApplicantStrategy getApplicantStrategy() {

        if (new SeniorCondition(
                new ExpertCondition(
                        new DeveloperCondition(
                                new USCondition(applicant))))
                .isSatisfied()
                ) {
            return new UsSeniorExpertDeveloperStrategy(applicant);
        }

        if (new SeniorCondition(
                new AdvancedCondition(
                        new DeveloperCondition(
                                new USCondition(applicant))))
                .isSatisfied()
                ) {
            return new UsSeniorAdvancedDeveloperStrategy(applicant);
        }

        if (new SeniorCondition(
                new NewbieCondition(
                        new DeveloperCondition(
                                new USCondition(applicant))))
                .isSatisfied()
                ) {
            return new UsSeniorNewbieDeveloperStrategy(applicant);
        }

        if (new SeniorCondition(
                new AdvancedCondition(
                        new TesterCondition(
                                new GBCondition(applicant))))
                .isSatisfied()
                ) {
            return new GbSeniorAdvancedTesterStrategy(applicant);
        }

        return new DefaultStrategy(applicant);
    }
}
