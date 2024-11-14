package com.quest.practice_variables;

public class StudentScore {
    public static void main(String[] args) {
        // Step 1: Initialize arrays
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };
        calculateAverageScores(names, ages, scores);
        System.out.println("-----------------\n");
        findHighestScorer(names, ages, scores);
        System.out.println("-----------------\n");
        rankStudents(names, ages, scores);
        System.out.println("-----------------\n");
        detectMissingData(names, scores);
    }

    //to calculate the average score
    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        int[] avgScore = new int[names.length];
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total = totalScore(scores[i]);
            avgScore[i] = total;
        }
        System.out.println("Average Scores");
        for (int i = 0; i < avgScore.length; i++) {
            System.out.println("Name :" + names[i] + ", Age :" + ages[i] + ", Avg score :" + avgScore[i]);
        }
    }

    //find the highest score person
    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        double highestTotal = 0;
        int highest = 0;
        double avgScore;
        for (int i = 0; i < scores.length; i++) {
            int total = 0;

            avgScore = totalScore(scores[i]);
            if (avgScore > highestTotal) {
                highestTotal = avgScore;
                highest = i;
            }

        }
        System.out.println("Highest Score is " + names[highest] + ", Age :" + ages[highest] + ", score average is :" + highestTotal);
    }
    // Method to rank students based on average score
    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        double[] avgScore = new double[names.length];

        double[][] rank = new double[names.length][1];
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            avgScore[i] = totalScore(scores[i]);
        }
        for (int i = 0; i < avgScore.length; i++) {
            for (int j = i + 1; j < avgScore.length; j++) {
                //sorting the avg score
                if (avgScore[i] < avgScore[j]) {
                    double temp = avgScore[i];
                    avgScore[i] = avgScore[j];
                    avgScore[j ] = temp;
                    //order the names correspond to avgScore
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        System.out.println("student Ranking");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + avgScore[i]);
        }
    }


    //find missing data
    public static void detectMissingData(String[] names, int[][] scores) {
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == -1) {
                    System.out.println(names[i] + "'s " + (j + 1) + "th subject score is missing");
                }
            }
        }
    }

    // Method to detect missing data in the scores array
    public static int totalScore(int[] subjects) {
        int total = 0;
        int count = 0;
        for (int subject : subjects) {
            if (subject != -1) {
                total += subject;
                count++;
            }
        }
        return total / count;
    }
}
