package com.example.MyCareerDB;

public class Scores {

//*****************************************
//* Tech Test Passing Score      (1 - 100)*
//*****************************************

//*****************************************
//* Theory Passing Score         (1 - 50) *
//*****************************************

//*****************************************
//* Practice Passing Score       ( 1 - 50)*
//*****************************************


    public static String tech_Test_Score = null;
    public static String theory_Passing_Score = null;
    public static String practice_Passing_Score = null;

    public static String theory_Passing_Score_Validation = "'Theory Passing Score' is required if 'Practice Passing Score' is set";
    public static String practice_Passing_Score_Validation = "'Practice Passing Score' is required if 'Theory Passing Score' is set";


    public static void main(String[] args) {

        // First Condition
        if (practice_Passing_Score != null) {
            System.out.println("'Practice Passing Score' field = " + practice_Passing_Score);
            System.out.println("Theory Passing Score is required");
            System.out.println(theory_Passing_Score_Validation);
        } else {
            System.out.println("'Practice Passing Score' field is empty");
        }

        // Second Condition
        if (theory_Passing_Score != null) {
            System.out.println("'Theory Passing Score' field = " + theory_Passing_Score);
            System.out.println("Practice Passing Score is required");
            System.out.println(practice_Passing_Score_Validation);
        } else {
            System.out.println("'Theory Passing Score' field is empty");
        }
    }
}
