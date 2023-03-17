package rayayoi.wissanu.lab4;
/*
 * Wissanu Rayayoi
 * ID : 653040460-3
 * sec.1
 */
import java.util.Scanner;
/**
 * This program DisplayMatrix program will show matrix that you enter member of metrix. 
 * At first program will go to main method and use {@link #inputMatrix()} method to ask user enter the scale of metrix by row and colum.
 * And then ask user to enter all member of metrix.After that program will show output describe below.</li>
 * <li>Show original form of metrix {@link #showMatrix()}</li>
 * <li>Show the metrix by row {@link #showMatrixByRow()}</li>
 * <li>Show the metrix by colum {@link #showMatrixByColum()}</li>
 * <li>Show the metrix by row backward {@link #showMatrixByRowBackward()}</li>
 * <li>Show the metrix by colum backward {@link #showMatrixByColumBackward()}</li>
 * <li>Show the diagonal elements of the metrix from the top left to the bottom right {@link #showMatrixByDiagonalTopLeftBottomRight()}</li>
 * <li>Show the diagonal elements of the metrix from the top right to the bottom left {@link #showMatrixByDiagonalTopRightBottomLeft()}</li>
 * <li>Show the metrix by row zigzag {@link #showMatrixByRowZigzag()}
 *  
 * @author Wissanu Rayayoi
 * @version 1.0,13/1/2023
 */
public class DisplayMatrix {
    static int[][] matrix;
    static int rowScale, colScale;
    public static void main(String[] args) {
        inputMatrix();//In put scale of metrix and enter member of metrix
        showMatrix();//Show original form of metrix 
        showMatrixByRow();//Show the metrix by row
        showMatrixByColum();//Show the metrix by colum 
        showMatrixByRowBackward();//Show the metrix by row backward 
        showMatrixByColumBackward();//Show the metrix by colum backward
        showMatrixByDiagonalTopLeftBottomRight();//Show the diagonal elements of the metrix from the top left to the bottom right
        showMatrixByDiagonalTopRightBottomLeft();//Show the diagonal elements of the metrix from the top right to the bottom left 
        showMatrixByRowZigzag();//Show the metrix by row zigzag
    }
    /**
     * input from user
     */
    public static void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (number of row then number of colum) : ");
        String numRowColum = scanner.nextLine();
        String sizeMatrix[] = numRowColum.split(" ");
        if (sizeMatrix.length == 2) {
            rowScale = Integer.parseInt(sizeMatrix[0]);
            colScale = Integer.parseInt(sizeMatrix[1]);
            matrix = new int[rowScale][colScale];
            for(int i = 0; i < rowScale; i++) {
                for(int j = 0; j < colScale; j++) {
                System.out.print("Enter element at row " + i + " colum " + j + " : ");
                int numMatrix = scanner.nextInt();
                matrix[i][j] =  numMatrix;
                }
            }
        } else {
            System.out.println("Please enter 2-dimensional matrix");
            System.exit(0);
        }
        scanner.close();
    }
    /**
     * show metrix
     */
    public static void showMatrix() {
        System.out.println("show the original matrix : ");
        for(int i = 0; i < rowScale; i++) {
            for(int j = 0; j < colScale; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * show metrix by row
     */
    public static void showMatrixByRow() {
        System.out.print("Show the matrix by row : ");
        for(int i = 0; i < rowScale; i++) {
            for(int j = 0; j < colScale; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
    /**
     * show metrix by colum
     */
    public static void showMatrixByColum() {
        System.out.print("\nShow the matrix by colum : ");
        for(int i = 0; i < colScale; i++) {
            for(int j = 0; j < rowScale; j++) {
                System.out.print(matrix[j][i] + " ");
            }
        }
    }
    /**
     * show metrix by row backward
     */
    public static void showMatrixByRowBackward() {
        System.out.print("\nShow the matrix by row backward : ");
        for(int i = rowScale - 1; i >= 0; i--) {
            for(int j = colScale - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
    /**
     * show metrix by colum backward
     */
    public static void showMatrixByColumBackward() {
        System.out.print("\nShow the matrix by colum backward : ");
        for(int i = colScale - 1; i >= 0; i--) {
            for(int j = rowScale - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
        }
    }
    /**
     * show metrix by  diagonal top left to bottom right
     */
    public static void showMatrixByDiagonalTopLeftBottomRight() {
        System.out.print("\nShow the digonal elements of the matrix from top-left to bottom-right : ");
        for(int i = 0; i < rowScale; i++) {
                System.out.print(matrix[i][i] + " ");
        }
    }
    /**
     * show metrix by diagonal top right to bottom left
     */
    public static void showMatrixByDiagonalTopRightBottomLeft() {
        System.out.print("\nShow the diagonal elements of the matrix from top-right to bottom-left : ");
        int newScaleCol = colScale - 1;
        for(int i = 0; i < rowScale; i++) {
                System.out.print(matrix[i][newScaleCol] + " ");
                newScaleCol--;
        }
    }
    /**
     * show metrix by row zigzag
     */
    public static void showMatrixByRowZigzag() {
        System.out.print("\nShow the matrix by row zigzag : ");
        for(int i = 0; i < rowScale; i++) {
            if (i % 2 ==  0) {
                for(int j = 0; j < colScale; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for(int j = colScale - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }  
}
