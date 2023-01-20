import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
class Die {
  int sides;
  ArrayList<Integer> rolls;
  Die(int sides){
    this.sides = sides;
    this.rolls = rolls;
  }
  public void roll(int count){
    for (int i = 0; i < count; i++){
      int randomNum = ThreadLocalRandom.current().nextInt(1, this.sides + 1);
      this.rolls.add(randomNum);
    }
  }
  public ArrayList<Integer> getTopSide(){
    return(rolls);
  }
  public int getNumSide(){
    return(sides);
  }
  public String toString(){
    return("Sides " + this.sides);
  }
}