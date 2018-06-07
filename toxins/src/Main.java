import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    public static void printBiomeCombinations(Biome biome) {
        ArrayList<Ingredient> bi = biome.ingredients;
        System.out.println("<section>");
        System.out.println("<p class=right>Single Biomes</p>");
        System.out.println("<h2>" + biome.name + ":</h2>");
        for (int i = 0; i < bi.size(); i++) {
            for (int j = i + 1; j < bi.size(); j++) {
                for (int k = j + 1; k < bi.size(); k++) {

                    if (!(bi.get(i).ingCategory == bi.get(j).ingCategory || bi.get(i).ingCategory == bi.get(k).ingCategory || bi.get(j).ingCategory == bi.get(k).ingCategory)) {
                        System.out.print("<p> ");
                        String s = (bi.get(i).name.replace(" ", "").substring(0, 3) + bi.get(j).name.replace(" ", "").substring(0, 3) + bi.get(k).name.replace(" ", "").substring(0, 3)).toLowerCase();
                        s = s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(Character.toUpperCase(s.charAt(0))));

                        System.out.print("<b>" + s + "</b>");
                        System.out.println(": " + bi.get(i).name + " " + "<i>" + bi.get(i).rarity.toString().toLowerCase() + "</i>" + ", " + bi.get(j).name + " " + "<i>" + bi.get(j).rarity.toString().toLowerCase() + "</i>" + ", " + bi.get(k).name + " " + "<i>" + bi.get(k).rarity.toString().toLowerCase() + "</i>" + "</p>");
                    }
                }
            }
        }
        System.out.println("</section>");
    }

    public static void printBiomeCombinations(Biome biome1, Biome biome2) {
        ArrayList<Biome> biomes = new ArrayList<Biome>();
        biomes.add(biome1);
        biomes.add(biome2);
        System.out.println("<section>");
        System.out.println("<p class=right>Pair Biomes</p>");
        System.out.println("<h2>" + biome1.name + " + " + biome2.name + ":</h2>");
        for (int i = 0; i < biomes.size(); i++) {
            for (int j = 0; j < biomes.size(); j++) {
                for (int k = 0; k < biomes.size(); k++) {
                    if (!(biomes.get(i) == biomes.get(j) || biomes.get(i) == biomes.get(k))) {
                        for (int l = 0; l < biomes.get(i).ingredients.size(); l++) {
                            for (int m = 0; m < biomes.get(j).ingredients.size(); m++) {
                                for (int n = 0; n < biomes.get(k).ingredients.size(); n++) {
                                    if (!(biomes.get(i).ingredients.get(l).ingCategory == biomes.get(j).ingredients.get(m).ingCategory
                                            || biomes.get(i).ingredients.get(l).ingCategory == biomes.get(k).ingredients.get(n).ingCategory
                                            || biomes.get(j).ingredients.get(m).ingCategory == biomes.get(k).ingredients.get(n).ingCategory)) {
                                        System.out.print("<p>" + biomes.get(i).name + ", " + biomes.get(j).name + ", " + biomes.get(k).name + ": ");
                                        String s = (biomes.get(i).ingredients.get(l).name.replace(" ",
                                                "").substring(0, 3) + biomes.get(j).ingredients.get(m).name.replace(" ",
                                                "").substring(0, 3) + biomes.get(k).ingredients.get(n).name.replace(" ",
                                                "").substring(0, 3)).toLowerCase();

                                        s = s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(Character.toUpperCase(s.charAt(0))));
                                        System.out.print("<b>" + s + "</b>");
                                        System.out.println(": " + biomes.get(i).ingredients.get(l).name + " "
                                                + "<i>"+biomes.get(i).ingredients.get(l).rarity.toString().toLowerCase() +"</i>"+ ", "
                                                + biomes.get(j).ingredients.get(m).name + " " + "<i>"+biomes.get(j).ingredients.get(m).rarity.toString().toLowerCase()+"</i>"
                                                + ", " + biomes.get(k).ingredients.get(n).name + " " +"<i>"+ biomes.get(k).ingredients.get(n).rarity.toString().toLowerCase() +"</i>"+ "</p>");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("</section>");
    }

    public static void printBiomeCombinations(Biome biome1, Biome biome2, Biome biome3) {
        ArrayList<Biome> biomes = new ArrayList<Biome>();
        biomes.add(biome1);
        biomes.add(biome2);
        biomes.add(biome3);
        System.out.println("<section>");
        System.out.println("<p class=right>Triple Biomes</p>");
        System.out.println("<h2>" + biome1.name + " + " + biome2.name + " + " + biome3.name + ":</h2>");
        for (int i = 0; i < biomes.size(); i++) {
            for (int j = i + 1; j < biomes.size(); j++) {
                for (int k = j + 1; k < biomes.size(); k++) {
                    if (!(biomes.get(i) == biomes.get(j) || biomes.get(i) == biomes.get(k) || biomes.get(j) == biomes.get(k))) {
                        for (int l = 0; l < biomes.get(i).ingredients.size(); l++) {
                            for (int m = 0; m < biomes.get(j).ingredients.size(); m++) {
                                for (int n = 0; n < biomes.get(k).ingredients.size(); n++) {
                                    if (!(biomes.get(i).ingredients.get(l).ingCategory == biomes.get(j).ingredients.get(m).ingCategory
                                            || biomes.get(i).ingredients.get(l).ingCategory == biomes.get(k).ingredients.get(n).ingCategory
                                            || biomes.get(j).ingredients.get(m).ingCategory == biomes.get(k).ingredients.get(n).ingCategory)) {
                                        System.out.print("<p>");
                                        String s = (biomes.get(i).ingredients.get(l).name.replace(" ",
                                                "").substring(0, 3) + biomes.get(j).ingredients.get(m).name.replace(" ",
                                                "").substring(0, 3) + biomes.get(k).ingredients.get(n).name.replace(" ",
                                                "").substring(0, 3)).toLowerCase();
                                        s = s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(Character.toUpperCase(s.charAt(0))));
                                        System.out.print("<b>" + s + "</b>");
                                        System.out.println(": " + biomes.get(i).ingredients.get(l).name + " "
                                                + "<i>"+biomes.get(i).ingredients.get(l).rarity.toString().toLowerCase()+"</i>" + ", "
                                                + biomes.get(j).ingredients.get(m).name + " " + "<i>"+biomes.get(j).ingredients.get(m).rarity.toString().toLowerCase()+"</i>"
                                                + ", " + biomes.get(k).ingredients.get(n).name + " " + "<i>"+biomes.get(k).ingredients.get(n).rarity.toString().toLowerCase()+"</i>" + "</p>");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("</section>");
    }

    public static void main(String[] args) {

        try {
            PrintStream out = new PrintStream(new FileOutputStream("index.html"));
            System.setOut(out);
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:400,900|Raleway\" rel=\"stylesheet\">\n" +
                "    <title>Toxins</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "   <header> <h1>The</h1> <h1>Principia</h1> <h1>Toxicology</h1>\n" +
                "<hr>\n"+
                "   <p>Autore: Eastly Whitekey</p> \n"+
                "<hr>\n"+
                "   <i>Published by the society for greater toxicological research and development;</i> <br> <i>In conjunction with venom and vice laboratories.</i> </header>\n");

        ArrayList<Biome> biomes = new ArrayList<Biome>();

        Biome Field = new Biome("Field");
        Biome River = new Biome("River");
        Biome Ocean = new Biome("Ocean");
        Biome Forest = new Biome("Forest");
        Biome Desert = new Biome("Desert");
        Biome Mountain = new Biome("Mountain");
        Biome City = new Biome("City");
        Biome Cave = new Biome("Cave");


        Field.addIngredient(new Ingredient("Rabbit foot: Lesser Catalyst", Rarity.COMMON, IngCategory.CATALYST));
        Field.addIngredient(new Ingredient("Foxtail: Lesser Durator", Rarity.COMMON, IngCategory.DURATOR));
        Field.addIngredient(new Ingredient("Bee Venom: Localized Paralysis", Rarity.COMMON, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Yellow Weed: Lesser Vertigo", Rarity.COMMON, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Apple Seeds: Lesser Weakness to Excessive Temperature", Rarity.COMMON, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Death Rose Thorn: Lesser Hemorrhaging", Rarity.COMMON, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Hollen Berries: Laughter", Rarity.COMMON, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Purple Aphids: Lesser Terror", Rarity.COMMON, IngCategory.EFFECTOR));

        Field.addIngredient(new Ingredient("Hawk Eye: Temporary blindness", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Horsehair: Mid Catalyst", Rarity.UNCOMMON, IngCategory.CATALYST));
        Field.addIngredient(new Ingredient("Snake Venom: Mid Slow", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Apricot Pit: Paralysis", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Papaver Poppy: Mid Restore HP", Rarity.UNCOMMON, IngCategory.EFFECTOR));

        Field.addIngredient(new Ingredient("Horns of a 100 point buck: Greater  Hemorrhaging", Rarity.RARE, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Unicorn Piss: Greater Elimination of Magic Capability", Rarity.RARE, IngCategory.EFFECTOR));
        Field.addIngredient(new Ingredient("Goldenwing Butterfly: Greater Sleep", Rarity.RARE, IngCategory.EFFECTOR));

        River.addIngredient(new Ingredient("Eye of Newt: Lesser Catalyst", Rarity.COMMON, IngCategory.CATALYST));
        River.addIngredient(new Ingredient("WIllow Bark: Lesser Restore HP", Rarity.COMMON, IngCategory.EFFECTOR));
        River.addIngredient(new Ingredient("Toad Glop: Lesser Durator", Rarity.COMMON, IngCategory.DURATOR));
        River.addIngredient(new Ingredient("Sulma Beans: Lesser Flatulence", Rarity.COMMON, IngCategory.EFFECTOR));
        River.addIngredient(new Ingredient("Greybloom Root: Lesser Sleep", Rarity.COMMON, IngCategory.EFFECTOR));

        River.addIngredient(new Ingredient("Salamander Tail: Mid Catalyst", Rarity.UNCOMMON, IngCategory.CATALYST));
        River.addIngredient(new Ingredient("Poison Dart Frog Skin: Mid Weakness to Excessive Temperature", Rarity.UNCOMMON, IngCategory.EFFECTOR));

        River.addIngredient(new Ingredient("Axolotl Gills: Greater Midnight Damage", Rarity.RARE, IngCategory.EFFECTOR));
        River.addIngredient(new Ingredient("Platypus Bill: Greater Durator", Rarity.RARE, IngCategory.DURATOR));
        River.addIngredient(new Ingredient("Loch Ness Tail: Melting", Rarity.RARE, IngCategory.EFFECTOR));

        Ocean.addIngredient(new Ingredient("Raggleweed: Lesser Catalyst", Rarity.COMMON, IngCategory.CATALYST));
        Ocean.addIngredient(new Ingredient("Stone Fish Tail: Muteness", Rarity.COMMON, IngCategory.EFFECTOR));
        Ocean.addIngredient(new Ingredient("Marbled Cone Snail Shell: Lesser Speed Boost", Rarity.COMMON, IngCategory.EFFECTOR));
        Ocean.addIngredient(new Ingredient("FishBones: Lesser Durator", Rarity.COMMON, IngCategory.DURATOR));

        Ocean.addIngredient(new Ingredient("Dolphin Fin: Mid Flatulence", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Ocean.addIngredient(new Ingredient("Lamprey Stomach: Mid Hemorrhaging", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Ocean.addIngredient(new Ingredient("Box Jelly Tentacles: Mid Terro", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Ocean.addIngredient(new Ingredient("Blanket Octopus Radula: Mid Catalyst", Rarity.UNCOMMON, IngCategory.CATALYST));

        Ocean.addIngredient(new Ingredient("Blue-Ringed Octopus Mantle: Greater Catalyst", Rarity.RARE, IngCategory.CATALYST));
        Ocean.addIngredient(new Ingredient("Pink Dolphin Fin: Greater Flatulence", Rarity.RARE, IngCategory.EFFECTOR));
        Ocean.addIngredient(new Ingredient("Cosmic Ship Scrap: Greater Vertigo", Rarity.RARE, IngCategory.EFFECTOR));
        Ocean.addIngredient(new Ingredient("Clubhook Squid Bile: Greater Lingering Scent", Rarity.RARE, IngCategory.EFFECTOR));

        Forest.addIngredient(new Ingredient("Hieronymus Mushrooms: Laxative", Rarity.COMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Creeping Ivy Leaves: Lesser Numbness", Rarity.COMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Wild Rose Thorns: Lesser Hemorrhage", Rarity.COMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Jarrin Fungus: Lesser Restore HP", Rarity.COMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Green Makai Root: Local Paralysis", Rarity.COMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Moscoroso Fungus: Lesser Madness", Rarity.COMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Wasp Thorax: Lesser Catalyst", Rarity.COMMON, IngCategory.CATALYST));
        Forest.addIngredient(new Ingredient("Douglas Spruce Amber: Lesser Terror", Rarity.COMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Wood Turpentine: Lesser Durator", Rarity.COMMON, IngCategory.DURATOR));
        Forest.addIngredient(new Ingredient("Ulocladium: Muteness", Rarity.COMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Acremonium: Lesser Midnight Damage", Rarity.COMMON, IngCategory.EFFECTOR));

        Forest.addIngredient(new Ingredient("Deathbloom Petals: Mid Numbness", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Sassafras root: Mid Speed Boost", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Orange Capped Mushroom: Mid Vertigo", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Dried Nightbloom Berry: Mid Midnight Damage", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Natu Feathers: Mid Durator", Rarity.UNCOMMON, IngCategory.DURATOR));

        Forest.addIngredient(new Ingredient("Bat Venom: Greater Numbness", Rarity.RARE, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Coca Leaves: Greater Speed Boost", Rarity.RARE, IngCategory.EFFECTOR));
        Forest.addIngredient(new Ingredient("Vorpal Tree Leaves: Greater Restore HP", Rarity.RARE, IngCategory.EFFECTOR));

        Desert.addIngredient(new Ingredient("Death Stalker Scorpion Carapace: Lesser Catalyst", Rarity.COMMON, IngCategory.CATALYST));
        Desert.addIngredient(new Ingredient("Sun Cactus Nettles: Lesser Restore HP", Rarity.COMMON, IngCategory.EFFECTOR));
        Desert.addIngredient(new Ingredient("Agave: Lesser Elimination of Magic Capability", Rarity.COMMON, IngCategory.EFFECTOR));
        Desert.addIngredient(new Ingredient("Laconian Cactus Juice: Apnea", Rarity.COMMON, IngCategory.EFFECTOR));
        Desert.addIngredient(new Ingredient("Jubjub Nettles: Lesser Durator", Rarity.COMMON, IngCategory.DURATOR));

        Desert.addIngredient(new Ingredient("Blue Agave: Mid Elimination of Magic Capability", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Desert.addIngredient(new Ingredient("Jackal's Hair: Mid Durator", Rarity.UNCOMMON, IngCategory.DURATOR));
        Desert.addIngredient(new Ingredient("Teng Lizard Stomach: Mid Lingering Scent,", Rarity.UNCOMMON, IngCategory.EFFECTOR));

        Desert.addIngredient(new Ingredient("Lophophora Juice: Greater Madness", Rarity.RARE, IngCategory.EFFECTOR));
        Desert.addIngredient(new Ingredient("King Cobra Fangs: Greater Weakness to Excessive Temperature", Rarity.RARE, IngCategory.EFFECTOR));
        Desert.addIngredient(new Ingredient("Oasis Water: Greater Restore HP", Rarity.RARE, IngCategory.EFFECTOR));

        Mountain.addIngredient(new Ingredient("Crest Poppy: Induce Affection", Rarity.COMMON, IngCategory.EFFECTOR));
        Mountain.addIngredient(new Ingredient("Crag Brambles: Lesser Durator", Rarity.COMMON, IngCategory.DURATOR));
        Mountain.addIngredient(new Ingredient("Inland Taipan Saliva: Hostility", Rarity.COMMON, IngCategory.EFFECTOR));
        Mountain.addIngredient(new Ingredient("Banana Slug Mucus: Laxative", Rarity.COMMON, IngCategory.EFFECTOR));
        Mountain.addIngredient(new Ingredient("Tundra Poppy Petals: Lesser Restore HP", Rarity.COMMON, IngCategory.EFFECTOR));
        Mountain.addIngredient(new Ingredient("Colossi Lizard Scales: Lesser Catalyst", Rarity.COMMON, IngCategory.CATALYST));
        Mountain.addIngredient(new Ingredient("Silverthorn: Local Paralysis", Rarity.COMMON, IngCategory.EFFECTOR));
        Mountain.addIngredient(new Ingredient("Nyissa Pollen: Itch", Rarity.COMMON, IngCategory.EFFECTOR));

        Mountain.addIngredient(new Ingredient("Ephedra Sinica: Coma", Rarity.UNCOMMON, IngCategory.EFFECTOR));

        Mountain.addIngredient(new Ingredient("Rainbow Pheasant Feathers: Greater Durator", Rarity.RARE, IngCategory.DURATOR));
        Mountain.addIngredient(new Ingredient("Powdered Dragon Bone: Greater Catalyst", Rarity.RARE, IngCategory.CATALYST));
        Mountain.addIngredient(new Ingredient("Mountain Monk Wine: Extreme Drunkenness", Rarity.RARE, IngCategory.EFFECTOR));

        City.addIngredient(new Ingredient("Rat Bile: Itch", Rarity.COMMON, IngCategory.EFFECTOR));
        City.addIngredient(new Ingredient("Winecellar Mold: Lesser Lingering Scent", Rarity.COMMON, IngCategory.EFFECTOR));
        City.addIngredient(new Ingredient("Black Cat Hair: Lesser Nightmare", Rarity.COMMON, IngCategory.EFFECTOR));
        City.addIngredient(new Ingredient("Wandering Spider Thorax: Lesser Catalyst", Rarity.COMMON, IngCategory.CATALYST));
        City.addIngredient(new Ingredient("Rook Spleen: Lesser Terror", Rarity.COMMON, IngCategory.EFFECTOR));
        City.addIngredient(new Ingredient("Plum Pit: Local Paralysis", Rarity.COMMON, IngCategory.EFFECTOR));
        City.addIngredient(new Ingredient("Peach Pit: Lesser Restore HP", Rarity.COMMON, IngCategory.EFFECTOR));
        City.addIngredient(new Ingredient("Copper Rust: Lesser Durator", Rarity.COMMON, IngCategory.DURATOR));

        City.addIngredient(new Ingredient("Penicillium mold: Mid Restore HP", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        City.addIngredient(new Ingredient("Benzene: Mid Durator", Rarity.UNCOMMON, IngCategory.DURATOR));
        City.addIngredient(new Ingredient("Acetone: Mid Madness", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        City.addIngredient(new Ingredient("Cherry Pit: Mid Nightmare", Rarity.UNCOMMON, IngCategory.EFFECTOR));

        City.addIngredient(new Ingredient("Cosmic Scrap: Greater Catalyst", Rarity.RARE, IngCategory.CATALYST));
        City.addIngredient(new Ingredient("Cladosporium: Greater Durator", Rarity.RARE, IngCategory.DURATOR));

        Cave.addIngredient(new Ingredient("Purple Cave Moss: Lesser Durator", Rarity.COMMON, IngCategory.DURATOR));
        Cave.addIngredient(new Ingredient("Brown Spider Abdomen: Lesser Catalyst", Rarity.COMMON, IngCategory.CATALYST));
        Cave.addIngredient(new Ingredient("Stachybotrys: Make Flammable", Rarity.COMMON, IngCategory.EFFECTOR));
        Cave.addIngredient(new Ingredient("Trichoderma: Lesser Nightmare", Rarity.COMMON, IngCategory.EFFECTOR));

        Cave.addIngredient(new Ingredient("Sandbat Leavings: Mid Sleep", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Cave.addIngredient(new Ingredient("Garou Moss: Mid Restore HP", Rarity.UNCOMMON, IngCategory.EFFECTOR));
        Cave.addIngredient(new Ingredient("Alternaria: Mid Durator", Rarity.UNCOMMON, IngCategory.DURATOR));

        Cave.addIngredient(new Ingredient("Ghast Sweat: Greater Terror", Rarity.RARE, IngCategory.EFFECTOR));
        Cave.addIngredient(new Ingredient("Elf Bones: Greater Nightmare", Rarity.RARE, IngCategory.EFFECTOR));


        biomes.add(Field);
        biomes.add(River);
        biomes.add(Ocean);
        biomes.add(Forest);
        biomes.add(Desert);
        biomes.add(Mountain);
        biomes.add(City);
        biomes.add(Cave);

        System.out.println("<section class='toc'>");
        System.out.println("<h2> Table of Contents<h2>");
        System.out.println("<h3>Introduction");
        System.out.print("<p>Objective, Abstract Principles of Toxin Production</p>");
        System.out.println("<h3>Single Biomes<h3>");
        System.out.println("<p>");
        for (int i = 0; i < biomes.size(); i++) {

                System.out.print(biomes.get(i).name + ", ");


        }
        System.out.println("</p>");
        System.out.println("<h3>Pair Biomes<h3>");
        System.out.println("<p>");
        for (int i = 0; i < biomes.size(); i++) {
            for (int j = i + 1; j < biomes.size(); j++) {

                    System.out.println(biomes.get(i).name + "+" + biomes.get(j).name + ", ");

            }
        }
        System.out.println("</p>");
        System.out.println("<h3>Triple Biomes<h3>");
        System.out.println("<p>");
        for (int i = 0; i < biomes.size(); i++) {
            for (int j = i + 1; j < biomes.size(); j++) {
                for (int k = j + 1; k < biomes.size(); k++) {

                        System.out.println(biomes.get(i).name + "+" + biomes.get(j).name + "+"+ biomes.get(k).name + ", ");

                }
            }
        }
        System.out.println("</p>");
        System.out.println("</section>");


        System.out.println("<section>");
        System.out.println("<p class=right>Introduction</p>");
        System.out.println("<h2>Objective</h2>");
        System.out.println("<p> As you venture out into the world you will come across a wide varity of biomes "+
                "and an even wider variety of ingredients belonging to those biomes. You may find yourself with "+
                "too wide a variety of items to make sense of what toxins you can cook up. You may also find yourself with "+
                "too few items to make anything at all and no direction as to what you can harvest in your immediate environment "+
                "to make use of the scraps in your inventory. "+
                "My goal in creating this document is to rid Toxicologists of the issues mentioned above by providing a comprehensive and complete "+
                "field reference.</p> <p>Newcomers to the field are welcome and encouraged to "+
                "read the <i>'Abstract Principles of Toxin Production'</i> section; It should bring even the most simple of laypersons "+
                "up to speed on mixing toxins.</p>");

        System.out.println("<p>");
        System.out.println("</section>");


        System.out.println("<section>");
        System.out.println("<p class=right>Introduction</p>");
        System.out.println("<h2> Abstract Principles of Toxin Production</h2>");
        System.out.println("<p> Toxin production is as simple as 1 2 3... really, there are only 3 ingredients in any toxin. "+
                "To make a toxin you need an effector (the ingredient that causes an effect e.g. paralysis), a durator"+
                " (the ingredient that determines the length of the effect), and a catalyst (the ingredient that allows the other two to be combined). "+
                "In general, the more rare an ingredient is the greater its respective properties will be. Rare effectors will cause more gruesome damages, "+
                "rare durators will make your toxin last ages, and rare catalysts can improve the properties of otherwise common ingredients.</p>"+
                "<p>It is also important to note that biomes have an effect on toxins. In general the more biomes you source your ingredients from the "+
                "stronger your toxins will be. Much like a good catalyst, sourcing ingredients from different biomes will boost the effects of otherwise common ingredients. "+
                "However, it would be a shame to think of multi biome sourcing as a substitute for a good catalyst or other ingredients, because the most powerful toxins " +
                "are made of the rarest components from the widest variety of biomes.</p>");
        System.out.println("</section>");


        for (Biome biome : biomes) {
            printBiomeCombinations(biome);
        }

        for (int i = 0; i < biomes.size(); i++) {
            for (int j = i + 1; j < biomes.size(); j++) {
                printBiomeCombinations(biomes.get(i), biomes.get(j));
            }
        }

        for (int i = 0; i < biomes.size(); i++) {
            for (int j = i + 1; j < biomes.size(); j++) {
                for (int k = j + 1; k < biomes.size(); k++) {
                    printBiomeCombinations(biomes.get(i), biomes.get(j), biomes.get(k));
                }
            }
        }

        System.out.print("</body> \n </html>");

    }


}
