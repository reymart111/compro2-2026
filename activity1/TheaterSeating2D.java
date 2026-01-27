public class TheaterSeating2D {
    public static void main(String[] args) {
        // 1. Declare and initialize the 2D array for the theater
        int[][] theater = new int[5][8]; // 5 rows, 8 seats per row

        // 2. Book the seat at row 2, column 5
        theater[2][5] = 1;

        // 3. Book the seat at row 0, column 0
        theater[0][0] = 1;

        System.out.println("Theater Seating Chart (0=Available, 1=Booked):");

        // 4. Use nested loops to print the seating chart
        for (int row = 0; row < theater.length; row++) {
            for (int col = 0; col < theater[row].length; col++) {
                System.out.print(theater[row][col] + " ");
            }
            System.out.println(); // new line after each row
        }

        // 5. Count and print the total number of booked seats
        int bookedSeats = 0;
        for (int row = 0; row < theater.length; row++) {
            for (int col = 0; col < theater[row].length; col++) {
                if (theater[row][col] == 1) {
                    bookedSeats++;
                }
            }
        }

        System.out.println("Total booked seats: " + bookedSeats);
    }
}

