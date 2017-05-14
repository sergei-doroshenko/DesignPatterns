package org.sergei.design_patterns.replace_if_else;

public class IfElseComputation {
    private final Applicant applicant;

    public IfElseComputation(Applicant applicant) {
        this.applicant = applicant;
    }

    public Long compute() {
        if (applicant.getCountry().equals("US") && applicant.getProfession().equals("developer")) {
            if (applicant.getAge() > 30 && applicant.getExperience() > 5) {
                return (long) (applicant.getAmount() * 1.03);
            } else if (applicant.getAge() > 30 && applicant.getExperience() < 5 && applicant.getExperience() > 3) {
                return (long) (applicant.getAmount() * 1.1);
            } else {
                return (long) (applicant.getAmount() * 1.5);
            }
        } else if (applicant.getCountry().equals("GB") && applicant.getProfession().equals("tester")) {
            if (applicant.getAge() > 30 && applicant.getExperience() > 5) {
                return (long) (applicant.getAmount() * 1.08);
            } else if (applicant.getAge() > 30 && applicant.getExperience() < 5 && applicant.getExperience() > 3) {
                return (long) (applicant.getAmount() * 1.2);
            } else {
                return (long) (applicant.getAmount() * 1.7);
            }
        } else {
            return applicant.getAmount() * 2;
        }
    }

}
