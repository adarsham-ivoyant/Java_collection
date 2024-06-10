package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPro {
    public static void main(String[] args) {
        HashMap<String,Double> fruitPrices = new HashMap<>();

        // Add some fruits and their prices
        addFruit(fruitPrices, "Apple", 1.2);
        addFruit(fruitPrices, "Banana", 0.5);
        addFruit(fruitPrices, "Cherry", 2.5);

        // Retrieve prices
        System.out.println("Price of Apple: " + getPrice(fruitPrices, "Apple"));
        System.out.println("Price of Banana: " + getPrice(fruitPrices, "Banana"));
        System.out.println("Price of Cherry: " + getPrice(fruitPrices, "Cherry"));

        // Try to get the price of a fruit not in the HashMap
        System.out.println("Price of Mango: " + getPrice(fruitPrices, "Mango"));

        // Remove a fruit
        removeFruit(fruitPrices, "Banana");

        // Try to get the price of the removed fruit
        System.out.println("Price of Banana: " + getPrice(fruitPrices, "Banana"));
    }

    public static void addFruit(HashMap<String,Double> map,String fruit, double price){
        map.put(fruit,price);
        System.out.println(fruit+" added with price "+price);
    }

    public static Double getPrice(HashMap<String,Double> map,String fruit){
        return map.getOrDefault(fruit,null);
    }

    // Function to remove a fruit
    public static void removeFruit(HashMap<String, Double> map, String fruit) {
        if (map.containsKey(fruit)) {
            map.remove(fruit);
            System.out.println(fruit + " removed");
        } else {
            System.out.println("Fruit not found");
        }
    }

}
