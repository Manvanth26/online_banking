package com.example.Banking.Models;

public class TransferDetails {
    private long saccount;
    private long raccount;
    private int amount;
    private String Username;

    public long getSaccount() {
        return saccount;
    }

    public void setSaccount(long saccount) {
        this.saccount = saccount;
    }

    public long getRaccount() {
        return raccount;
    }

    public void setRaccount(long raccount) {
        this.raccount = raccount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }



}
