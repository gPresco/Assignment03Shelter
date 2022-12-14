import processing.core.PApplet;
import processing.core.PImage;

public class MySketch extends PApplet {
    private final int BACKGROUND_COLOR = 122;
    private final String[] dogNames = {"Lou","Buddy","Fluffy","Carl"};
    private final String[] dogBreeds = {"Lab","Bulldog","WhoKnows","Dalmation"};
    private final int[] dogAges = {10,7,2,3};
    private final String[] dogImages = {"assets/dog1.png","assets/dog1.png","assets/dog1.png","assets/dog1.png"};

    Shelter shelter;
    Dog dog;
    PImage img;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        shelter = new Shelter(this);
        
        for(int i = 0; i < 4; ++i){
            img = loadImage(dogImages[i]);
            dog = new Dog(this, 20, 50 * i, img, dogNames[i], dogBreeds[i], dogAges[i]);
            shelter.intake(dog);
        }
        
        /* TODO:  create a shelter object and add all the animals described in the arrays above to it */
        /* Hint: use fantasy driven design. Pretend the shelter class has a method to intake a new dog and call it. */
        /* You can worry about the details later when you design the Shelter class */



    }


    public void draw() {
        background(BACKGROUND_COLOR);
        textSize(12);
        shelter.displayAnimals();
        textSize(32);
        text("Gray's Dog Shelter", 150, 30);
        /* TODO:  Display all the dogs in the shelter */
        /* Hint: use fantasy driven design. Pretend the shelter class has a method to display its dogs and call it. */
        /* You can worry about the details later when you design the Shelter class */


    }


}
