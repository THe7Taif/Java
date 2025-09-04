import java.util.Random;

public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 1000;
        final int MAXAGE = 32;

        // Pre-coded age distribution table (Cumulative % , Age)
        int ageDistribution[][] = {
                {10, 20},  		// 10 %		// This line matches to random numbers 1..10,  gives age 20
                {22, 21},  		// 12 %    	// This line matches to random numbers 11..22, gives age 21 (which is 22 - 10).
                {35, 22},		// 13 %    	// ...
                {48, 23},    	// 13 %
                {60, 24},  		// 12 %
                {70, 25}, 		// 10 %
                {79, 26},  		// 9 %
                {87, 27},  		// 8 %
                {94, 28},		// 7 %
                {98, 30},  		// 4 %
                {100,MAXAGE}, 	// 2 %	  	// This line matches to random numbers 99 ja 100
        };


        // Run 3 test simulations to see variability
        for (int run = 1; run <= 3; run++) {
            int[] generatedAges = new int[MAXAGE + 1]; // frequency array
            Random random = new Random();

            // Generate ages according to distribution
            for (int i = 0; i < REITERATIONS; i++) { // repeating the i till 1000 times.
                int randomNumber = random.nextInt(100) + 1; // random number 0..100, we add + 1 to make it from 1..100.

                // search for the right age:
                int j = 0; // var to start from index 0 in our List.
                while (randomNumber > ageDistribution[j][0]) j++; // find the correct age for example: x = 15, the first list are from 1..10, second from 11..22, so the second it present the the age 21 years old.
                int age = ageDistribution[j][1]; // for the Match age value -->
                generatedAges[age]++;            // increment "count" number for that age.
            }

            // Output results
            System.out.println("=== Simulation Run " + run + " ===");
            System.out.println("Age  Count  %-Share");
            for (int age = 0; age <= MAXAGE; age++) {
                if (generatedAges[age] != 0) {
                    double percent = (generatedAges[age] / (double) REITERATIONS) * 100;
                    System.out.printf("%-4d %-6d %-8.2f\n", age, generatedAges[age], percent);
                }
            }
            System.out.println();
        }
    }
}
