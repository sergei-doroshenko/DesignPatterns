package org.sergei.design_patterns.replace_if_else;

public class Applicant {
    private final int age;
    private final int experience;
    private final String country;
    private final String profession;
    private final long amount;

    public Applicant(int age, int experience, String country, String profession, long amount) {
        this.age = age;
        this.experience = experience;
        this.country = country;
        this.profession = profession;
        this.amount = amount;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String getCountry() {
        return country;
    }

    public String getProfession() {
        return profession;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "age=" + age +
                ", experience=" + experience +
                ", profession='" + profession + '\'' +
                ", country='" + country + '\'' +
                ", amount=" + amount +
                '}';
    }
}
