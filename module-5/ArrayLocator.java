//Cameron Mendez
//09/06/2025
//Module-5


public class ArrayLocator {

    //Method to locate largest element in 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};  //store row and column of largest element
        double max = arrayParam[0][0]; //start with first element as max

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;  //row index
                    location[1] = j;  //column index
                }
            }
        }
        return location;
    }

    //Method to locate largest element in 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    //Method to locate smallest element in 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    //Method to locate smallest element in 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    //Test
    public static void main(String[] args) {
        int[][] intArray = {
            {3, 5, 7},
            {2, 8, 1},
            {9, 4, 6}
        };

        double[][] doubleArray = {
            {1.5, 3.2, 0.8},
            {9.1, 2.3, 5.6},
            {7.7, 6.6, 4.4}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int location: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest int location: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
        System.out.println("Largest double location: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest double location: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}



