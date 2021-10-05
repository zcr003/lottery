package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class Shuffler {

  private final Random rng;

  //rng is our random generator
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  //two methods in the same class

  public void shuffle(int[] data) {
    shufflePart(data, data.length - 1);
  }

  public int[] shuffle(int[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  public void shuffle(double[] data) {
    shufflePart(data, data.length - 1);
  }

  public double[] shuffle(double[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  //This method was created by taking a for loop from above
  //...Going to Refactor Extract/Introduce and choosing Method

  // TODO Create overloads of both forms of shuffle (full and partial) for all the array types below.

  private void shufflePart(int[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        int temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  private void shufflePart(double[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        double temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  // TODO Create overloads of shufflePart for boolean[], char[], short[], long[], float[], Object[]

}
