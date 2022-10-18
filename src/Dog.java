import processing.core.PImage;
import processing.core.PApplet;
import static processing.core.PConstants.CENTER;
import static processing.core.PConstants.RECT;

public class Dog {
    private PApplet sketch;
    private PImage img;
    private static final int IMG_SCALE_FACTOR = 2;
    private int x,y;
    private String name;
    private String breed;
    private int age;
    /* TODO  Add additional member variables. Choose appropriate access modifiers */


    /**
     * TODO:  Your Dog constructor should initialize your member variables. Add that code in the body of the constructor
     * @param sketch
     * @param x
     * @param y
     * @param img
     * @param name
     * @param breed
     * @param age
     */
    protected Dog(PApplet sketch, int x, int y, PImage img, String name, String breed, int age) {
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.img = img;
        this.name = name;
        this.breed = breed;
        this.age = age;


    }

    /**
     * TODO:  Your draw method should draw the a dog object. Remember each dog object contains an image of the dog, its description,
     * and an AdoptMe button. Work on displaying each element, one at a time. Test after each addition.
     */
    protected void draw() {
        sketch.image(img, x, y, img.height * IMG_SCALE_FACTOR, img.width *IMG_SCALE_FACTOR);
        sketch.fill(0,0,125);
        sketch.text(toString(), x + img.width, y);
        

    }


    /**
     * TODO:  Your toString method should return a String containing the name, breed, and age of the dog object
     */
    public String toString() {
        return "Name: " + name + " Breed: " + breed + " Age: " + age;

    }
}


