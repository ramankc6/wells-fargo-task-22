package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float risk;

    @Column(nullable = false)
    private float total;

    @ManyToOne
    private Client client;


    protected Portfolio(){

    }

    public Portfolio(String name, float risk, float total, Client client){
        this.name = name;
        this.risk = risk;
        this.total = total;
        this.client = client;
    }

    public long getPortfolioID(){
        return portfolioId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public float getRisk(){
        return risk;
    }
    public void setRisk(float risk){
        this.risk = risk;
    }

        public float getTotal(){
        return total;
    }
    public void setTotal(float total){
        this.total = total;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }
}
