package com.step.assignments.classes;

public class Calculator {
    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getMultiplyResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;
        }
        return this.firstNumber / this.secondNumber;
    }
}

