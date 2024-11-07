package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Compte {

    private String numCompte;
    private Date dateCreation;
    private Date dateUpdate;
    private String devise;
    private Client client;
    private Bnaque banque;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Client getClient() {
        return client;
    }

    public Bnaque getBanque() {
        return banque;
    }
}
