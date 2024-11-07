package org.example;

import java.util.ArrayList;

public class Client {
    private String numClient;
    private String nom;
    private String prenom;
    private String addresse;
    private String phone;
    private String email;
    private ArrayList<Compte> comptes= new ArrayList<>();

    public String getAddresse() {
        return addresse;
    }
}
