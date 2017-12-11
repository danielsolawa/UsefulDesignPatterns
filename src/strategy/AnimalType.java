package strategy;

/**
 * Created by NeverForgive on 2017-12-11.
 */
public class AnimalType {

    private AnimalStrategy animalStrategy;

    public void setAnimalType(AnimalStrategy animalStrategy){
        this.animalStrategy = animalStrategy;
    }

    public String getAnimalType(){
        if(animalStrategy != null)
          return  animalStrategy.getType();


        return "No type selected";
    }
}
