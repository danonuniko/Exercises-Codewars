/* Kata Level: 5.
 * 
 * Pete likes to bake some cakes. He has some recipes and ingredients. Unfortunately he is not good in maths. 
 * Can you help him to find out, how many cakes he could bake considering his recipes?
 * 
 * Write a function cakes(), which takes the recipe (object) and the available ingredients (also an object) 
 * and returns the maximum number of cakes Pete can bake (integer). For simplicity there are no units for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200). 
 * Ingredients that are not present in the objects, can be considered as 0.
 * 
 * Examples:
 * 
 * # must return 2
 * cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200})
 * 
 * # must return 0
 * cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000})
 */

import java.util.*;

public class NumberAvailableRecipes {

	public static String recipesCount(HashMap<String, Integer> recipes, HashMap<String, Integer> ingredients) {
        List<Integer> possibilities = new ArrayList<Integer>();
        for(String key : recipes.keySet()) {
            if(ingredients.containsKey(key)) {
                possibilities.add(ingredients.get(key) / recipes.get(key));
            } else  return "0";
        }

        Object[] result = possibilities.toArray();
        Arrays.sort(result);

        return result[0].toString();
    }

    public static void main(String[] args) {
        
        HashMap<String, Integer> recipes = new HashMap<>();
        recipes.put("flour", 500);
        recipes.put("sugar", 200);
        recipes.put("eggs", 1);

        HashMap<String, Integer> ingredients = new HashMap<>();
        ingredients.put("flour", 1200);
        ingredients.put("sugar", 1200);
        ingredients.put("eggs", 5);
        ingredients.put("milk", 2000);

        System.out.println(recipesCount(recipes, ingredients));

    }

}