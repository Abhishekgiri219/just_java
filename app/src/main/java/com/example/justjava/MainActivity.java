package com.example.justjava;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    int numberOfCoffees = 0 , price = 0 ;

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
        String priceMessage = "Total : $" + price + "\nThank You !";
        displayMessage(priceMessage);
    }

    /**
     * This method is called when the plus button is clicked.
     */

    public void increment(View view){
        ++numberOfCoffees;
        price = numberOfCoffees*5;
        display(numberOfCoffees);
        displayPrice(price);
    }

    /**
     * This method is called when the minus button is clicked.
     */

    public void decrement(View view){
        --numberOfCoffees;
        if(numberOfCoffees < 0) numberOfCoffees = 0;
        price = numberOfCoffees*5;

        display(numberOfCoffees);
        displayPrice(price);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}