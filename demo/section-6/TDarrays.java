import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {

        int[][] grades1 = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 },
        };

        int[][] grades = new int[3][4];
        // Harry
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        // Ron
        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;

        // Hermione
        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        System.out.println("\n");

        // System.out.println("\tHarry: " + grades1[0][0] + " " + grades1[0][1] + " " +
        // grades1[0][2] + " " + grades1[0][3]);
        // System.out.println("\tRon: " + grades1[1][0] + " " + grades1[1][1] + " " +
        // grades1[1][2] + " " + grades1[1][3]);
        // System.out.println("\tHermione: " + grades1[2][0] + " " + grades1[2][1] + " "
        // + grades1[2][2] + " " + grades1[2][3]);

        for (int i = 0; i < grades1.length; i++) {

            switch (i) {
                case 0: System.out.println("\tHarry: "); break;
                case 1: System.out.println("\tRon: " ); break;
                case 2: System.out.println("\tHermione: "); break;
            }
            for (int j = 0; j < grades1[i].length; j++) {
                System.out.print(grades1[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}
