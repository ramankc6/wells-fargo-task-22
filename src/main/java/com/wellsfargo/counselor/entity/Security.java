package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;



    @Column(nullable = false)
    private String symbol;


    @Column(nullable = false)
    private String type;


    @Column(nullable = false)
    private int quantity;


    @Column(nullable = false)
    private float price;



    @ManyToOne
    private Portfolio portfolio;


    protected Security(){

    }

    public Security(String symbol, String type, int quantity, float price, Portfolio portfolio){
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.portfolio = portfolio;
    }
    public long getSecurityId() {
        return securityId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
