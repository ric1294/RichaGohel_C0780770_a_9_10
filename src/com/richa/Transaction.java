package com.richa;

public class Transaction extends Sales{
    public Transaction() {
    }

    public Transaction(Double sales, Double rate, Double commission, Double advance, Double pay) {
        super(sales, rate, commission, advance, pay);
    }

    public double calculatePay(double salesAmount){
        this.setSales(salesAmount);
        this.rate = super.commissionRate(); //inheritance
        this.commission = this.getSales() * this.getRate() / 100;
        this.setPay(this.getCommission() - this.getAdvance());
        return this.getPay();
    }

    @Override
    public String display() {
        if(this.getPay() > this.getAdvance() ){
            System.out.println("Your Remaining Pay is:" +this.getPay());
        }else{
            System.out.println("You have to pay back to company and amount is:" + this.getPay()*-1);
        }
        return null;
    }


}
