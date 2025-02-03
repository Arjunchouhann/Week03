package Day02.stacksandqueues.circulartourproblem;

public class CircularTour {
    public static int circularTour(int[] petrol, int[] distance) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalSurplus += petrol[i] - distance[i];
            currentSurplus += petrol[i] - distance[i];

            // If current surplus is negative, reset the starting point
            if (currentSurplus < 0) {
                start = i + 1; // Move to the next pump
                currentSurplus = 0; // Reset current surplus
            }
        }

        // If total surplus is non-negative, return the starting point
        return (totalSurplus >= 0) ? start : -1; // -1 indicates no solution
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int startingPoint = circularTour(petrol, distance);

        if (startingPoint != -1) {
            System.out.println("The starting point is: " + startingPoint);
        } else {
            System.out.println("No solution exists.");
        }
    }
}