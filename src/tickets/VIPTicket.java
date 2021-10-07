/*
Assignment: Ticket System
Author: Vladimir Ivanov
Date: 09/25/2011
File: VIPTicket.java
 */
package tickets;

import org.jetbrains.annotations.Contract;

import java.util.Random;

public class VIPTicket extends Ticket {

    private String freebies;

    public VIPTicket(){}
    public VIPTicket(String owner){
        freebies = getFreebies();
        setCost(175.0);
    }

    @Override
    public String getType(){
        return "VIP";
    }
    //method generates random perks
    public String getFreebies(){
        String[] freebiesList = {"free parking", "free booze", "backstage"};
        int random = new Random().nextInt(freebiesList.length);
        freebies = freebiesList[random];
        return freebies;
    }

    private double getVipCost(){
        return this.cost;
    }

    //That was clever. Could have though of it myself...
    public String toString(){
        String ticket = super.toString();
        int index = ticket.indexOf("E|");

        return ticket.substring(0, index) + "E| "
                + getFreebies()
                    + System.lineSeparator()
                        + "T| " + addEquals()
                            + System.lineSeparator();
    }
}

