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
    for (int sourceIndex = data.length - 1; sourceIndex > 0; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        int temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  public int[] shuffle(int[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        int temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

}
