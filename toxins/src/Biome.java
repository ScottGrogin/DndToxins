import java.util.ArrayList;

public class Biome {
    ArrayList<Ingredient> ingredients;
    String name;
    public Biome(String name){
        this.name = name;
        ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(Ingredient ingredient){
        ingredient.biomeName = name;
        ingredients.add(ingredient);
    }

    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }

    public ArrayList<Ingredient> getCommonIngredients(){
        ArrayList<Ingredient> temp = new ArrayList<Ingredient>();
        for(Ingredient ing : ingredients){
            if(ing.rarity == Rarity.COMMON){
                temp.add(ing);
            }
        }
        return temp;
    }

    public ArrayList<Ingredient> getUnCommonIngredients(){
        ArrayList<Ingredient> temp = new ArrayList<Ingredient>();
        for(Ingredient ing : ingredients){
            if(ing.rarity == Rarity.UNCOMMON){
                temp.add(ing);
            }
        }
        return temp;
    }

    public ArrayList<Ingredient> getRareIngredients(){
        ArrayList<Ingredient> temp = new ArrayList<Ingredient>();
        for(Ingredient ing : ingredients){
            if(ing.rarity == Rarity.RARE){
                temp.add(ing);
            }
        }
        return temp;
    }
}
