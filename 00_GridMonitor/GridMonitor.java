import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that represents a grid monitor with various calculations and data arrays.
 */
public class GridMonitor implements GridMonitorInterface {
    private int rows;
    private int columns;
    private double[][] gridData;
    private double[][] surroundingSumGrid;
    private double[][] surroundingAvgGrid;
    private double[][] deltaGrid;
    private boolean[][] dangerGrid;
    private String gridString;


    /**
     * Constructs a GridMonitor object by reading data from a file and performing calculations.
     *
     * @param fileName The name of the file containing grid data.
     * @throws FileNotFoundException If the specified file is not found.
     */
    public GridMonitor(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        this.rows = scan.nextInt();
        this.columns = scan.nextInt();

        setGrid(scan);
        sumCells();
        averageCells();
        deltaCells();
        dangerCells();
    }

    /**
     * Creates a deep copy of a two-dimensional double array.
     *
     * @param original The original double array to be copied.
     * @return A copy of the original array.
     */
    private double[][] makeCopy(double[][] original) {
        double[][] copy = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            copy[i] = Arrays.copyOf(original[i], columns);
        }
        return copy;
    }

    @Override
    public double[][] getBaseGrid() {
        return makeCopy(this.gridData);
    }

    @Override
    public double[][] getSurroundingSumGrid() {
        return makeCopy(this.surroundingSumGrid);
    }

    @Override
    public double[][] getSurroundingAvgGrid() {
        return makeCopy(this.surroundingAvgGrid);
    }

    @Override
    public double[][] getDeltaGrid() {
        return makeCopy(this.deltaGrid);
    }

    @Override
    public boolean[][] getDangerGrid() {
        boolean[][] copyDangerGrid = new boolean[rows][columns];

        for (int i = 0; i < rows; i++) {
            copyDangerGrid[i] = Arrays.copyOf(dangerGrid[i], columns);
        }
        return copyDangerGrid;
    }

    /**
     * Reads grid data from a provided scanner and populates the gridData array.
     *
     * @param scan The scanner object to read data from.
     */
    private void setGrid(Scanner scan) {
        this.gridData = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                gridData[i][j] = scan.nextDouble();
            }
        }
    }

    /**
     * Calculates the sum of surrounding cells for each grid cell.
     */
    private void sumCells() {
        this.surroundingSumGrid = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                surroundingSumGrid[i][j] = sumSingleCell(i, j);
            }
        }
    }

    /**
     * Calculates the average of surrounding cells for each grid cell.
     */
    private void averageCells() {
        this.surroundingAvgGrid = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                surroundingAvgGrid[i][j] = sumSingleCell(i, j) / 4.0;
            }
        }
    }

    /**
     * Calculates the delta (half the range) for each grid cell.
     */
    private void deltaCells() {
        double average;
        this.deltaGrid = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                average = sumSingleCell(i, j) / 4;
                deltaGrid[i][j] = Math.abs(average / 2);
            }
        }
    }

    /**
     * Calculates danger cells based on a lower and upper range.
     */
    private void dangerCells() {
        double lowerRange, higherRange;
        boolean isDangerous;
        this.dangerGrid = new boolean[rows][columns];
        this.gridString = "";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                lowerRange = surroundingAvgGrid[i][j] - deltaGrid[i][j];
                higherRange = surroundingAvgGrid[i][j] + deltaGrid[i][j];
                isDangerous = (lowerRange < this.gridData[i][j]) && (this.gridData[i][j] < higherRange) ? false : true;

                if (isDangerous) {
                    gridString += "Cell at [" + i + "] and [" + j + "] is dangerous \n";
                }
                dangerGrid[i][j] = isDangerous;
            }
        }
    }

    /**
     * Sums the values of surrounding cells for a given cell (x, y).
     *
     * @param x The row index of the cell.
     * @param y The column index of the cell.
     * @return The sum of surrounding cell values.
     */
    private double sumSingleCell(int x, int y) {
        double sum = 0;
        double currentValue = gridData[x][y];

        if (this.rows == 1) {
            sum += 2 * currentValue;
        } else if (x == 0) {
            sum += currentValue;
            sum += this.gridData[x + 1][y];
        } else if (x == rows - 1) {
            sum += currentValue;
            sum += this.gridData[x - 1][y];
        } else {
            sum += this.gridData[x - 1][y];
            sum += this.gridData[x + 1][y];
        }

        if (this.columns == 1) {
            sum += 2 * currentValue;
        } else if (y == 0) {
            sum += currentValue;
            sum += this.gridData[x][y + 1];
        } else if (y == columns - 1) {
            sum += currentValue;
            sum += this.gridData[x][y - 1];
        } else {
            sum += this.gridData[x][y - 1];
            sum += this.gridData[x][y + 1];
        }

        return sum;
    }

    public String toString() {
        return this.gridString;
    }
}
