package br.com.emersonmendes.study.algo;

import java.util.Arrays;

public class CandyDistribution {

    public int candy(int[] ratings) {

        int totalRatings = ratings.length;

        int totalCandies = 0;
        int[] candiesPerChild = new int[totalRatings];

        Arrays.fill(candiesPerChild, 1);

        // left to right
        for(int i = 1; i < totalRatings; i++){

            int prevRate = ratings[i - 1];
            int currentRate = ratings[i];

            if(currentRate > prevRate){
                candiesPerChild[i] = candiesPerChild[i - 1] + 1;
            }

        }

        // right to left
        for(int i = totalRatings - 2; i >= 0; i--){

            int nextRate = ratings[i + 1];
            int currentRate = ratings[i];
            int nextChildCandies = candiesPerChild[i + 1];
            int currentChildCandies = candiesPerChild[i];

            if(currentRate > nextRate){
                candiesPerChild[i] = Math.max(currentChildCandies, nextChildCandies + 1);
            }

        }

        for(int candy : candiesPerChild){
            totalCandies = totalCandies + candy;
        }

        return totalCandies;

    }

}
