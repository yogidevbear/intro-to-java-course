package com.cbfacademy.strings;

public class App {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        return word1.concat(word2).concat(word3);
        // return word1 + " " + word2 + " " + word3;
        // return String.join(" ", word1, word2, word3);
    }

    public static Boolean areEqual(String word1, String word2) {
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]".
        // throw new RuntimeException("Not implemented");
        return String.format("Item: %s. Price: £%.2f. Quantity: %d",item,price,quantity);
    }
}
