package com.szymon.company.MortgageSimulation;

/**
 *
 * @author szymon
 */
public class Mortgage {

    private int loanAmount;
    private int loanPeriod;
    private double bankMargin;
    private double bankProvision;

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public double getBankMargin() {
        return bankMargin;
    }

    public void setBankMargin(double bankMargin) {
        this.bankMargin = bankMargin;
    }

    public double getBankProvision() {
        return bankProvision;
    }

    public void setBankProvision(double bankProvision) {
        this.bankProvision = bankProvision;
    }
    
    
}
