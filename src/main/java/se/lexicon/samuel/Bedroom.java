package se.lexicon.samuel;

//with composition, you start with the sum of the parts and then build classes with the parts
//the parts will then have their defined characteristics

//this is the main object and the remaining classes are the parts with it's unique features
public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making bed | ");
        bed.make();
    }
}


//Exercise for Class composition
//This exercise was for a 1 bedroom apartment with some fields.
//some of the member variable from the original class will be made to have features which would be inherited
//the bedroom is the main object
// Ceiling, Bed and Lamp are the parts of the objects for the bedroom
//ceiling bed and lamp will have classes too and defined member variables