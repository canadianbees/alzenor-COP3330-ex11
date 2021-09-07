/*
 *  UCF COP3330 Fall 2021 Converter Class file
 *  Copyright 2021 Celina Alzenor
 */


package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter
{
    private final int euro;
    private final double rate;

    public Converter()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        this.euro = input.nextInt();

        System.out.print("What is the exchange rate?  ");
        this.rate = input.nextDouble();
    }

    public void Conversion()
    {
        int usDolla = (int) (this.rate * this.euro);
        DecimalFormat rounded = new DecimalFormat("###.##");

        System.out.print(this.euro+" euros at an exchange rate of "+this.rate+" is\n"+rounded.format(usDolla)+" U.S. dollars.");
    }

}
