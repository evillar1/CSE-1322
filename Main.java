//Evan Villar shark prompt practice

//SETTING UP ABSTRACT CLASS, GETTERS AND SETTERS UNDERSTAND
//getters, public int, string ~ | setters, public void ~
//create abstract for shark food with NO parameters, used later
//create to string and override from then on in all classes.

abstract class Shark {
	   private String name;
	   private int height;
	   private int weight;

	   public String getName() {
	       return name;
	   }

	   public void setName(String name) {
	       this.name = name;
	   }

	   public int getHeight() {
	       return height;
	   }

	   public void setHeight(int height) {
	       this.height = height;
	   }

	   public int getWeight() {
	       return weight;
	   }

	   public void setWeight(int weight) {
	       this.weight = weight;
      }

	   public abstract int SharkFood();

	   @Override
	   public String toString() {
	       return "Shark [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	   }
	}
   
//END OF ABSTRACT CLASS (parent class)



//BEGIN FIRST LEVEL CHILD CLASS
//all children extend from abstract parent, shark.
//use this.name = name for all children in constructor.
//override abstract method shark food and toString.

	class AdultGreatWhiteShark extends Shark {
	   private String name;
	   private int height, weight;

	   public AdultGreatWhiteShark(String name, int height, int weight) {
	       this.name = name;

	       if (height < 10)
	           this.height = 10;
	       else if (height > 21)
	           this.height = 21;
	       else
	           this.height = height;

	       if (weight < 1500)
	           this.height = 1500;
	       else if (weight > 2400)
	           this.height = 2400;
	       else
	           this.weight = weight;
	   }

	   public String getName() {
	       return name;
	   }

	   public int getHeight() {
	       return height;
	   }

	   public int getWeight() {
	       return weight;
	   }

	   @Override
	   public int SharkFood() {
	       int gained = (int) (Math.random() * (50 - 20) + 20);
	       return gained;
	   }

	   @Override
	   public String toString() {
	       return name + " is a great white shark and its height is " + height + " feet" + " and its weight is " + weight
	               + " pounds.";
	   }
	}
   
//END FIRST LEVEL CHILD CLASS



//BEGIN ANOTHER FIRST LEVEL CHILD CLASS.
//same as adult great white, different constructor info.
//still overrides abstract method sharkFood and tostring

	class AdultTigerShark extends Shark {
	   private String name;
	   private int height, weight;

	   public AdultTigerShark(String name, int height, int weight) {
	       this.name = name;

	       if (height < 10)
	           this.height = 10;
	       else if (height > 13)
	           this.height = 13;
	       else
	           this.height = height;

	       if (weight < 849)
	           this.height = 849;
	       else if (weight > 1400)
	           this.height = 1400;
	       else
	           this.weight = weight;
	   }

	   public String getName() {
	       return name;
	   }

	   public int getHeight() {
	       return height;
	   }

	   public int getWeight() {
	       return weight;
	   }

	   @Override
	   public int SharkFood() {
	       int gained = (int) (Math.random() * (50 - 20) + 20);
	       return gained;
	   }

	   @Override
	   public String toString() {
	       return name + " is a tiger shark and its height is " + height + " feet" + " and its weight is " + weight
	               + " pounds.";
	   }
	}
   
//END OF FIRST LEVEL CHILD CLASS.



//BEGIN SECOND LEVEL CHILD CLASS.
//The second level child class extends from first level child class.
//Baby extends from adult great white, and supers its constructor information.
//Baby shark's height and weight are half that of the adult, super adults weight and half it.
//overrides toString and Sharkfood.

	class BabyGreatWhiteShark extends AdultGreatWhiteShark {
	   private String name;
	   private int height, weight;

	   public BabyGreatWhiteShark(String name, int height, int weight){
	       super(name, height, weight);
	       this.name = name;
	       this.height = height/2;
	       this.weight = weight/2;
	   }

	   public String getName() {
	       return name;
	   }

	   public int getHeight() {
	       return height;
	   }

	   public int getWeight() {
	       return weight;
	   }

	   @Override
	   public int SharkFood() {
	       int gained = (int) (Math.random() * (50 - 20) + 20);
	       return gained;
	   }

	   @Override
	   public String toString() {
	       return name + " is a baby great white shark and its height is " + height + " feet" + " and its weight is " + weight
	               + " pounds.";
	   }
	}
   
//END SECOND LEVEL CHILD CLASS



//BEGIN ANOTHER SECOND LEVER CHILD CLASS
//same as baby great white

	class BabyTigerShark extends AdultTigerShark{

	   private String name;
	   private int height, weight;

	   public BabyTigerShark(String name, int height, int weight){
	       super(name, height, weight);
	       this.name = name;
	       this.height = height/2;
	       this.weight = weight/2;
	   }

	   public String getName() {
	       return name;
	   }

	   public int getHeight() {
	       return height;
	   }

	   public int getWeight() {
	       return weight;
	   }

	   @Override
	   public int SharkFood() {
	       int gained = (int) (Math.random() * (50 - 20) + 20);
	       return gained;
	   }

	   @Override
	   public String toString() {
	       return name + " is a baby tiger shark and its height is " + height + " feet" + " and its weight is " + weight
	               + " pounds.";
	   }
	}
   
//END SECOND LEVEL CHILD CLASS


//BEGIN MAIN METHOD
//create objects of shark from itself always, never mix and match begining and end names:
//greatWhite (name) = new greatWhite(~,~,~);
//for creating objects of babies, use any name THEN use getHeight and getWeight from respective parent.
//print statements call the print of the objects, the name, then the "weight gained" + sharkfood. use the shark food method with respective object:
//babies get their own shark food method from adults

	public class Main {
	   public static void main(String[] args) {
	      
	       AdultGreatWhiteShark greatWhite = new AdultGreatWhiteShark("Bob", 12, 1600);
	       AdultTigerShark tigerShark = new AdultTigerShark("Kim", 8, 950);
	       BabyGreatWhiteShark babyGreateWhite = new BabyGreatWhiteShark("Laura", greatWhite.getHeight(), greatWhite.getWeight());
	       BabyTigerShark babyTiger = new BabyTigerShark("Tim", tigerShark.getHeight(), tigerShark.getWeight());
	      
	       System.out.println(greatWhite+" "+greatWhite.getName()+" ate tuna and gained "+greatWhite.SharkFood()+" lbs");
	       System.out.println();
	       System.out.println(tigerShark+" "+tigerShark.getName()+" ate turtle anmd gained "+tigerShark.SharkFood()+" lbs");
	       System.out.println();
	       System.out.println(babyGreateWhite+" "+babyGreateWhite.getName()+" ate tuna and gained "+babyGreateWhite.SharkFood()+" lbs");
	       System.out.println();
	       System.out.println(babyTiger+" "+babyTiger.getName()+" ate turtle and gained "+babyTiger.SharkFood()+" lbs");
	   }
	}
	

//notes:
//shark food method: (int) (Math.random() * (50-20) +20)
//supering: super(~,~,~), do not specify int or string
