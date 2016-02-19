package Escudero.Balance;

import java.text.NumberFormat;

/**
 * Created by Kayleigh Escudero on 2/12/2016.
 */
public class CheckingAccount extends Account{

    // monthly fee instance variable
    double fee = 1;

    void subtractMonthlyFee() {balance -= getMonthlyFee();}

    void setMonthlyFee(double fee) {this.fee = fee;}

    double getMonthlyFee() {return fee;}

    String getMonthlyFeeFormatted() {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getMonthlyFee());
    }
}
