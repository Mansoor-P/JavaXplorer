package com.mansoor.java.dsa.arrays;
import java.util.Scanner;

public class WaterGlasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of i: ");
        int i = scanner.nextInt();
        System.out.print("Enter the value of j: ");
        int j = scanner.nextInt();
        System.out.print("Enter the value of val: ");
        float val = scanner.nextFloat();

        float result = FindWater(i, j, val);
        System.out.println("Amount of water in jth glass of ith row: " + result);

        scanner.close();
    }

    public static float FindWater(int i, int j, float val) {
        float[][] glasses = new float[i][i];
        glasses[0][0] = val;

        for (int row = 0; row < i - 1; row++) {
            for (int col = 0; col <= row; col++) {
                float overflow = (glasses[row][col] - 1.0f) / 2.0f;
                if (overflow > 0) {
                    glasses[row + 1][col] += overflow;
                    glasses[row + 1][col + 1] += overflow;
                    glasses[row][col] = 1.0f;
                }
            }
        }

        return glasses[i - 1][j - 1] >= 1.0f ? 1.0f : glasses[i - 1][j - 1];
    }
}

