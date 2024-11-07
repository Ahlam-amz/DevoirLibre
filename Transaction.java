package org.example;

import java.util.Objects;

public class Transaction {

    private String timeStump;
    private String reference;
    private enum type {VIRINT, VIREST, VIRCKA, VIRMULTA}
    private Compte compteSource;
    private Compte compteDestination;


    public String TypeTransaction(){
        String typeTransaction = "";
        if ( compteSource.getBanque() == compteDestination.getBanque()){
            typeTransaction= String.valueOf(type.VIRINT);
        }

        if (Objects.equals(compteSource.getBanque().getPays(), compteDestination.getBanque().getPays())){
            typeTransaction= String.valueOf(type.VIREST);
        }

        if (compteSource.getBanque() != compteDestination.getBanque() && compteSource.getBanque().getPays() != compteDestination.getBanque().getPays()){
            typeTransaction=String.valueOf(type.VIRCKA);
        }
        
        if (compteSource.getBanque() != compteDestination.getBanque()){
            typeTransaction= String.valueOf(type.VIRMULTA);
        }
        
    return typeTransaction;
    }
}
