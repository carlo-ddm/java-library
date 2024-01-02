import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("\nLet's play tic tac toe");

    // Task 1: Create an array with three rows of '_' characters.
    char[][] board = {
        { '_', '_', '_' },
        { '_', '_', '_' },
        { '_', '_', '_' }
    };

    // Task 2: Call the function printBoard();
    printBoard(board);

    /*
     * { Task 3: Loop through turns.
     * 
     * if (X) turn {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value.
     * } else {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value. Then, print it.
     * 
     * }
     * 
     * Task 6 - Call the function.
     * if return value == 3 {
     * print: X wins and break the loop
     * } else if return value == -3 {
     * print: O wins and break the loop
     * }
     * 
     * }
     */
    char[] turns = new char[9]; // 9 = total of turns
    char[][] gameBoard = Arrays.copyOf(board, board.length);

    for (int i = 1; i <= turns.length; i++) {

      if (i % 2 == 0) {
        System.out.println('O');
        int[] selectedSpot = askUser(gameBoard);
        gameBoard[selectedSpot[0]][selectedSpot[1]] = 'O';
        printBoard(gameBoard);
        checkWin(gameBoard);

      } else {
        System.out.println('X');
        int[] selectedSpot = askUser(gameBoard);
        gameBoard[selectedSpot[0]][selectedSpot[1]] = 'X';
        printBoard(gameBoard);
        checkWin(gameBoard);

      }
    }

    scan.close();
  }

  /**
   * Task 2 - Write a function that prints the board.
   * Function name - printBoard()
   * 
   * @param board (char[][])
   * 
   *              Inside the function:
   *              1. print a new line.
   *              2. print the board.
   *              • separate each row by two lines.
   *              • each row precedes a tab of space
   *              • each character in the grid has one space from the other
   *              character
   */
  public static void printBoard(char[][] board) {
    System.out.println("\n");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println("\n\n");
    }
  }

  /**
   * Task 4 - Write a function that lets the user choose a spot
   * Function name – askUser
   * 
   * @param board (char[][] board)
   * @return spot (int[])
   * 
   *         Inside the function
   *         1. Asks the user: - pick a row and column number:
   *         2. Check if the spot is taken. If so, let the user choose again.
   *         3. Return the row and column in an int[] array.
   * 
   */
  public static int[] askUser(char[][] board) {
    while (true) {
      String input = scan.nextLine();
      String[] data = input.split(" ");
      int[] dataInt = Arrays.stream(data).mapToInt(Integer::parseInt).toArray();
      if (board[dataInt[0]][dataInt[1]] != '_') {
        System.out.println("\nThe spot is taken. Try again.");
        continue;
      }
      return dataInt;
    }

  }

  /**
   * Task 6 - Write a function that determines the winner
   * Function name - checkWin
   * 
   * @param board (char[][])
   * @return count (int)
   * 
   *         Inside the function:
   *         1. Make a count variable that starts at 0.
   *         2. Check every row for a straight X or straight O (Task 7).
   *         3. Check every column for a straight X or straight O (Task 8).
   *         4. Check the left diagonal for a straight X or straight O (Task 9).
   *         5. Check the right diagonal for a straight X or straight O (Task 10).
   */
  public static int checkWin(char[][] board) {
    int counter = 0;
    counter = checkRows(board);
    counter = checkColumns(board);
    counter = checkLeft(board);
    counter = checkRight(board);
    return counter;
  }

  public static int checkRows(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'X') {
          count++;
        }

        if (board[i][j] == 'O') {
          count--;
        }
      }

      if (Math.abs(count) == 3) {
        return count;
      } else {
        count = 0;
      }

    }
    return count;
  }

  public static int checkColumns(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[j][i] == 'X') {
          count++;
        }

        if (board[j][i] == 'O') {
          count--;
        }
      }

      if (Math.abs(count) == 3) {
        return count;
      } else {
        count = 0;
      }

    }
    return count;
  }

  public static int checkLeft(char[][] board) {
    int count = 0;
    return count;
  }

  public static int checkRight(char[][] board) {
    int count = 0;
    return count;
  }

}
