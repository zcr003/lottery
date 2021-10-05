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

  public void shuffle(boolean[] data) {
    shufflePart(data, data.length - 1);
  }

  public boolean[] shuffle(boolean[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  public void shuffle(byte[] data) {
    shufflePart(data, data.length - 1);
  }

  public byte[] shuffle(byte[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  public void shuffle(char[] data) {
    shufflePart(data, data.length - 1);
  }

  public char[] shuffle(char[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  public void shuffle(short[] data) {
    shufflePart(data, data.length - 1);
  }

  public short[] shuffle(short[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  public void shuffle(long[] data) {
    shufflePart(data, data.length - 1);
  }

  public long[] shuffle(long[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  public void shuffle(float[] data) {
    shufflePart(data, data.length - 1);
  }

  public float[] shuffle(float[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  public void shuffle(Object[] data) {
    shufflePart(data, data.length - 1);
  }

  public Object[] shuffle(Object[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  //This method was created by taking a for loop from above
  //...Going to Refactor Extract/Introduce and choosing Method

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

  private void shufflePart(boolean[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        boolean temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  private void shufflePart(byte[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        byte temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  private void shufflePart(char[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        char temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  private void shufflePart(short[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        short temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  private void shufflePart(long[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        long temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  private void shufflePart(float[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        float temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  private void shufflePart(Object[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        Object temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }




}
