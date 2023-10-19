import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatChecker {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Step 1: javac FormatChecker.java , then hit enter");
            System.out.println("After Step 1: java FormatChecker file1 [file2 ... fileN]");
            return;
        }

        for (String fileName : args) {
            System.out.println("Processing file: " + fileName);
            try {
                validateFileFormat(fileName);
                System.out.println("File is VALID");
            } catch (FileNotFoundException e) {
                System.out.println("Error: The file " + fileName + " was not found.");
                System.out.println("File is INVALID");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format in the file " + fileName);
                System.out.println("File is INVALID");
            } catch (InputMismatchException e) {
                System.out.println("Error: Input mismatch in the file " + fileName);
                System.out.println("File is INVALID");
            } catch (Exception e) {
                System.out.println("Error: An unexpected exception occurred in the file " + fileName);
                System.out.println("File is INVALID");
            }
            System.out.println();
        }
    }

    public static void validateFileFormat(String fileName)
            throws FileNotFoundException, NumberFormatException, InputMismatchException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Check if the first row contains two space-separated positive integers
        if (!scanner.hasNextInt() || !scanner.hasNextInt()) {
            throw new InputMismatchException("Error: The first row must contain two positive integers.");
        }

        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        if (numRows <= 0 || numCols <= 0) {
            throw new InputMismatchException("Error: The number of rows and columns must be positive integers.");
        }

        // Validate the grid data
        int currentRow = 1;
        scanner.nextLine(); // Consume the newline character after the first row integers
        while (scanner.hasNextLine() && currentRow <= numRows) {
            String line = scanner.nextLine();
            System.out.println("Debug: Reading line: " + line);

            // Split the line into values based on whitespace
            String[] values = line.trim().split("\\s+");

            if (values.length != numCols) {
                throw new InputMismatchException("Error: Row " + currentRow + " has an invalid number of columns.");
            }

            for (String value : values) {
                try {
                    Double.parseDouble(value);
                } catch (NumberFormatException ex) {
                    throw new NumberFormatException("Error: Invalid data format in row " + currentRow + ".");
                }
            }
            currentRow++;
        }

        // Check if the number of rows matches the specified value
        if (numRows != currentRow - 1) {
            throw new InputMismatchException("Error: Number of rows does not match the specified value.");
        }

        scanner.close();
    }
}
