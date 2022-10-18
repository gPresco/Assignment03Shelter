import processing.core.PApplet;
import java.util.ArrayList;

public class Shelter {
    private PApplet sketch;
    private ArrayList<Dog> dogs;
    private int numberOfDogs;
    Dog dog;
    /* TODO: A Shelter contains (HAS) dogs inside it. Define an array list variable to store the dogs. Should it be public or private? */


    /**
     * TODO:  Your shelter constructor should initialize your member variables. Add that code in the body of the constructor.
     * Add an appropriate access modifier
     * @param sketch
     */
    Shelter(PApplet sketch) {
        this.sketch=sketch;
        dogs = new ArrayList<Dog>();
        numberOfDogs = 3;
    }


    /**
     * TODO:  Your intake method should add a new dog to your array list
     * Add an appropriate access modifier
     * @param dog
     */
    public void intake(Dog dog){
        for(int i = 0; i < numberOfDogs; ++i){
            dogs.add(i, dog);

        }

    }


    /**
     * TODO:  Your displayAnimals method should display all the dogs in the shelter, Don't forget to display your shelter title too!
     * Add an appropriate access modifier
     */
    public void displayAnimals(){
        for (int i = 0; i < numberOfDogs; ++i){
            dog = dogs.get(i);
            dog.draw();
        }

    }

}