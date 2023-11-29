package org.example;

public class Main {
    public static void main(String[] args) {
        // Skapa instanser av Office med olika storlekar
        Office office1 = new Office(42.7);
        Office office2 = new Office(20.9);
        Office office3 = new Office(38.7);
        Office office4 = new Office(24.3);
        Office office5 = new Office(12.5);
        Office office6 = new Office(14.8);

        // Skriv ut kostnaden för varje kontor
        System.out.println("Kostnad för kontor 1: " + office1.calculateMonthlyRent() + " kr per månad");
        System.out.println("Kostnad för kontor 2: " + office2.calculateMonthlyRent() + " kr per månad");
        System.out.println("Kostnad för kontor 3: " + office3.calculateMonthlyRent() + " kr per månad");
        System.out.println("Kostnad för kontor 4: " + office4.calculateMonthlyRent() + " kr per månad");
        System.out.println("Kostnad för kontor 5: " + office5.calculateMonthlyRent() + " kr per månad");
        System.out.println("Kostnad för kontor 6: " + office6.calculateMonthlyRent() + " kr per månad");
    }
}
