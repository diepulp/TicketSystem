/*
Assignment: Ticket System
Author: Vladimir Ivanov
Date: 09/25/2011
File: Ticket.java
 */
package tickets;

import java.text.NumberFormat;
import java.util.Locale;

public class Ticket {

    //instance fields
    private int seatNum;
    private int num;
    protected double cost;
    protected String owner;
    

    //class fields
    private static Integer nextSeatNum = 1;
    public static final int EQUALS = 24;

    public Ticket(){
        this("", 50.0);
        num = 12;
    }
    public Ticket(String name, Double cost){
        this.owner = name;
        this.cost = cost;
        seatNum = nextSeatNum++;
    }

    public int getNum() {
        return num;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType(){
        return "General Admission";
    }

    protected String addEquals() {
        String result = "";
        for (int i = 0; i < EQUALS; i++){
            result += "=";
        }
        return result;
    }
    

    public String toString(){
    // Note we do not use a NumberFormat constructor but rather a static factory method
    // that constructs the object for us - here we are actually constructing a DecimalFormat object
    // which inherits from the NumberFormat Class

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

        String result ="T|" + addEquals() + System.lineSeparator();
        result += "I| SEAT # " + seatNum + System.lineSeparator();
        result += "C| COST: " + formatter.format(cost) + System.lineSeparator();
        result += "K| TYPE: " + getType() + System.lineSeparator();
        result += "E|  "  + System.lineSeparator();
        result +="T|" + addEquals() + System.lineSeparator();

        return result;

    }
}
