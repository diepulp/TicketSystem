/*
Assignment: Ticket System
Author: Vladimir Ivanov
Date: 09/25/2011
File: TicketClient.java
 */
package client;

import tickets.Ticket;
import tickets.VIPTicket;
import java.util.ArrayList;
import java.util.List;


public class TicketClient extends Ticket {
    //amount of tickets to be printed
    private static final int amount = 26;

    //generate 90% and 10% values
    static int nineTenth = (int) Math.floor(0.9 * amount);
    static int ten = amount - nineTenth;

    //method generates List of tickets and vip tickets (90/10)
    public static void generateList(List<Ticket> list){
        for (int i = 0; i < nineTenth; i++ ){
            list.add(new Ticket());
        }
        for (int i = 0; i < ten; i++){
            list.add(new VIPTicket("Meself"));
        }
    }
    //prints the list
    static void printList(List<Ticket> tickets){
        for(Ticket t: tickets){
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

        List<Ticket> list = new ArrayList<>();

        TicketClient.generateList(list);

        TicketClient.printList(list);


        }//end of main
    }//end of TicketClient

