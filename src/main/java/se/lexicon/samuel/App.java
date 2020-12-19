package se.lexicon.samuel;


public class App 
{
    public static void main( String[] args ) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("modern", 4 , 3, 2, 1);

        Lamp lamp = new Lamp("classic", false, 75);

        Bedroom bedroom = new Bedroom("Sam", wall1, wall2, wall3, wall4, ceiling, bed,lamp);
        bedroom.makeBed();
        lamp.turnOn();



    }
}
