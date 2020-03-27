package com.ski.biathlons;

import java.util.Comparator;

/**
 * Class that build an athlete with the info below:
 * AthleteNumber,AthleteName,CountryCode,SkiTimeResult(Minutes:Seconds),FirstShootingRange,SecondShootingRange,ThirdShootingRange
 */

public class Athlete {

    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private SkiTimeResult skiTimeResult;
    private String firstShooting;
    private String secondShooting;
    private String thirdShooting;


    public Athlete(int athleteNumber, String athleteName, String countryCode, SkiTimeResult skiTimeResult, String firstShooting, String secondShooting, String thirdShooting) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShooting = firstShooting;
        this.secondShooting = secondShooting;
        this.thirdShooting = thirdShooting;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public SkiTimeResult getSkiTimeResult() {
        return skiTimeResult;
    }

    public void setSkiTimeResult(SkiTimeResult skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }

    public String getFirstShooting() {
        return firstShooting;
    }

    public void setFirstShooting(String firstShooting) {
        this.firstShooting = firstShooting;
    }

    public String getSecondShooting() {
        return secondShooting;
    }

    public void setSecondShooting(String secondShooting) {
        this.secondShooting = secondShooting;
    }

    public String getThirdShooting() {
        return thirdShooting;
    }

    public void setThirdShooting(String thirdShooting) {
        this.thirdShooting = thirdShooting;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "athleteNumber=" + athleteNumber +
                ", athleteName='" + athleteName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTimeResult=" + skiTimeResult +
                ", firstShooting='" + firstShooting + '\'' +
                ", secondShooting='" + secondShooting + '\'' +
                ", thirdShooting='" + thirdShooting + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * class that compare the final results of two athletes
     */

    public static class AthletesResultsComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Athlete a1 = (Athlete) o1;
            Athlete a2 = (Athlete) o2;

            if (a1.getSkiTimeResult().sec() < a2.getSkiTimeResult().sec()) return -1;
            if (a1.getSkiTimeResult().sec() > a2.getSkiTimeResult().sec()) return 1;
            return 0;
        }
    }
}
