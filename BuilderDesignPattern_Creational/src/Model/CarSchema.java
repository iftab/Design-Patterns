package Model;

public class CarSchema {
	private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    CarSchema(int id, String brand, String model, String color, int height, String engine, int nbrOfDoors) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.height = height;
        this.engine = engine;
        this.nbrOfDoors = nbrOfDoors;
    }
    
    @Override
    public String toString() {
        return "Car [" +this.id+ "," + this.height +"," + this.brand +"," +this.model +"," + this.color + "," +this.engine+ ","  +this.nbrOfDoors+"]";
    }
    
}
