package org.sergei.design_patterns.replace_if_else;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class IfElseComputationTest {

    @Test
    public void usDeveloperSeniorExperienced() {
        IfElseComputation computation = new IfElseComputation(new Applicant(35, 10, "US","developer", 1000));
        Long result = computation.compute();
        Assert.assertThat(result, is(1030L));
    }

    @Test
    public void usDeveloperSeniorAdvanced() {
        IfElseComputation computation = new IfElseComputation(new Applicant(35, 4,"US", "developer", 1000));
        Long result = computation.compute();
        Assert.assertThat(result, is(1100L));
    }

    @Test
    public void usDeveloperSeniorNewbie() {
        IfElseComputation computation = new IfElseComputation(new Applicant(35, 1,"US", "developer", 1000));
        Long result = computation.compute();
        Assert.assertThat(result, is(1500L));
    }

    @Test
    public void gbTesterSeniorAdvanced() {
        IfElseComputation computation = new IfElseComputation(new Applicant(35, 4, "GB","tester", 1000));
        Long result = computation.compute();
        Assert.assertThat(result, is(1200L));
    }
}
