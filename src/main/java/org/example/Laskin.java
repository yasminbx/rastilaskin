package org.example;

public class Laskin {

    private double tulos;  // Variable to store the result

    // Method to turn the calculator on and initialize the result to 0
    public void virtaON() {
        tulos = 0;
    }

    // Method to turn the calculator off (optional for any cleanup, currently does nothing)
    public void virtaOFF() {
        // Optional cleanup or shutdown logic could go here
    }

    // Method to reset the result to 0
    public void nollaa() {
        tulos = 0;
    }

    // Method to return the current result
    public double annaTulos() {
        return tulos;
    }

    // Method to add a value to the result
    public void lisaa(double n) {
        tulos = tulos + n;
    }

    // Method to subtract a value from the result
    public void vahenna(double n) {
        tulos = tulos - n;
    }

    // Method to multiply the result by a value
    public void kerro(double n) {
        tulos = tulos * n;
    }

    // Method to divide the result by a value
    public void jaa(double n) {
        if (n == 0) {
            throw new IllegalArgumentException("Nollalla ei voi jakaa!"); // "Cannot divide by zero!"
        }
        tulos = tulos / n;
    }

    // Method to calculate the square of a number
    public void nelio(double n) {
        tulos = n * n;
    }


    public static void main(String[] args) {
        Laskin laskin = new Laskin();

        laskin.virtaON();
        System.out.println("...Virta päälle...");

        laskin.lisaa(500);
        System.out.println("Lisää 500    = " + laskin.annaTulos());

        laskin.lisaa(200);
        System.out.println("Lisää 200    = " + laskin.annaTulos());

        laskin.vahenna(100);
        System.out.println("Vähennä 100  = " + laskin.annaTulos());

        laskin.jaa(2);
        System.out.println("Jaa 2:lla    = " + laskin.annaTulos());

        laskin.kerro(10);
        System.out.println("Kerro 10:llä = " + laskin.annaTulos());

        // Using the new nelio() method to square a number
        laskin.nelio(4);
        System.out.println("Luvun 4 neliö = " + laskin.annaTulos());

        System.out.println("...Nollataan...");
        laskin.nollaa();

        laskin.lisaa(500);
        System.out.println("Lisää 500    = " + laskin.annaTulos());

        laskin.virtaOFF();
        System.out.println("...Katkaistaan virta...");
    }

    public void neliojuuri(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatiivisella luvulla ei voi olla neliöjuurta!");


        }}}
