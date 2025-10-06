public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 1000;   // generate 1000 ages
        final int MAXAGE = 35;

        // Cumulative percentages with ages
        int agedistribution[][] = {
                {16, 20},    // 16%
                {34, 21},    // 18%
                {52, 22},    // 18%
                {68, 23},    // 16%
                {82, 24},    // 14%
                {89, 25},    // 7%
                {94, 26},    // 5%
                {96, 28},    // 2%
                {98, 30},    // 2%
                {100, MAXAGE} // 2%
        };

        int[] generatedAges = new int[MAXAGE + 1];

        // Generate ages
        for (int i = 0; i < REITERATIONS; i++) {
            int x = (int) (Math.random() * 100) + 1; // random 1–100
            int j = 0;
            while (x > agedistribution[j][0]) j++; // find correct row
            generatedAges[agedistribution[j][1]]++; // increment age count
        }

        // Output results
        System.out.println("Age  Count   %-Share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (generatedAges[age] != 0) {
                double percent = (double) generatedAges[age] / REITERATIONS * 100;
                System.out.printf("%-4d %-6d %-6.2f%n", age, generatedAges[age], percent);
            }
        }
    }
}
