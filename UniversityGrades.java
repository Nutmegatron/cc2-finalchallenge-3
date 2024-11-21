//Carlinbhert Adryanne De Guzman
//CITCS 1N - A
//CC2 Final Challenge No. 2
//November 21, 2024


public class UniversityGrades {
    public static void main(String[] args) {
        // 1D array to store student names
        String[] universityStudents = {"Carl", "Karl", "Jarl", "Marl", "Barl"};

        // 2D array for each student's grade
        int[][] studentGrades = {
                {87, 90, 83},
                {82, 75, 70},
                {70, 75, 67},
                {97, 96, 99},
                {88, 79, 89}
        };

        // calculate student grades with nested for loop
        for (int i = 0; i < universityStudents.length; i++) {
            int totalGrades = 0;
//            total grades is calculated with another for loop
            for (int j = 0; j < studentGrades[i].length; j++) {
                totalGrades += studentGrades[i][j];
            }
//            average grade is calculated from total, studentGrades is converted to double for calculation to work
            double averageGrade = totalGrades / (double) studentGrades[i].length;
            System.out.println(universityStudents[i] + "'s average grade is: " + averageGrade);
        }
    }
}
