package org.example;

public class Office {
    private double squareMeters;

    // Konstruktor som tar emot kvadratmeter som parameter
    public Office(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    // Metod för att beräkna månatlig hyra
    public double calculateMonthlyRent() {
        double annualRent;
        if (squareMeters <= 20) {
            annualRent = squareMeters * 3200;
        } else {
            annualRent = squareMeters * 2785;
        }

        // Lägg till fast kostnad
        annualRent += squareMeters * 150;

        // Dela det årliga beloppet med 12 för att få månadsbeloppet
        return annualRent / 12;
    }
}
