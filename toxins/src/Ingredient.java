public class Ingredient {
    public String name;
    Rarity rarity;
    IngCategory ingCategory;
    String biomeName;
    public Ingredient(String name, Rarity rarity, IngCategory  ingCategory){
        this.name = name;
        this.rarity = rarity;
        this.ingCategory = ingCategory;
    }
}
