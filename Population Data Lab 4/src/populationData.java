
import java.util.*;


public class populationData {
    public static void main(String[] args) {

        int[] yearArray = {
                1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,
                1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,
                1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,
                1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990
        };

        int[] populationArray = {
                151868,153982,156393,158956,161884, 165069,168088,171187,174149,177135,
                179979,182992,185771,188483,191141, 193526,195576,197457,199399,201385,
                203984,206827,209284,211357,213342, 215465,217563,219760,222095,224567,
                227225,229466,231664,233792,235825,237924,240133,242289,244499,246819,249623,
        };

        int[] deltaArray = new int[40];
        int year1 ;
        int year2 ;
        int delta;
        int totalDelta = 0;
        int sumOfDeltaArray = 0;
        int min;
        int max;

        //Finding the change in population between current year and previous year
        for (int i = 1; i < populationArray.length; i++) {
            delta = populationArray[i] - populationArray[i-1];

            //Setting delta of population array into a separate array
            deltaArray[i-1] = delta;
            year1 = yearArray[i-1];
            year2 = yearArray[i];

            System.out.println( " Change in population from " + year1 + "-"+ year2 + ": "  + delta);
        }

        // Finding the sum of the change in population array
        for (int i : deltaArray) {
            sumOfDeltaArray += i;
            totalDelta = sumOfDeltaArray / (deltaArray.length + 1);
        }

        // Sorting the change in population array
        Arrays.sort(deltaArray);

        // After sorting the 0 index would be the min while max would be array length -1
        min = deltaArray[0];
        max = deltaArray[deltaArray.length - 1];
        
        // System.out.println(Arrays.toString(deltaArray));

        System.out.println("*** ---------------------------------------------------------------------- ***");
        System.out.println("The total population increase from 1950 - 1990 is " + sumOfDeltaArray + " .");
        System.out.println("The average annual population change from 1950 - 1990 is " + totalDelta + ".");
        System.out.println("The year with the greatest increase was in " + yearArray[4] + " with an increase of "  + max + " .");
        System.out.println("The year with the smallest increase was in " + yearArray[16] + " with an increase of "  + min + " .");
        System.out.println("*** ---------------------------------------------------------------------- ***");
        System.exit(0);

    }
}
