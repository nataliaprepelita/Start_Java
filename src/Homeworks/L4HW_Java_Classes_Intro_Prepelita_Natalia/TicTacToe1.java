package Homeworks.L4HW_Java_Classes_Intro_Prepelita_Natalia;

import java.util.Scanner;

public class TicTacToe1 {

    char table[][] = new char[3][3];

    void showField() {
        table[0][0] = '1';
        table[0][1] = '2';
        table[0][2] = '3';
        table[1][0] = '4';
        table[1][1] = '5';
        table[1][2] = '6';
        table[2][0] = '7';
        table[2][1] = '8';
        table[2][2] = '9';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void playerTurn(char user, char turn) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (user == table[i][j]) {
                    table[i][j] = turn;
                }
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }

    boolean checkWinner(char m) {
        if ((table[0][0] == m) & (table[0][1] == m) & (table[0][2] == m)) {
            return true;
        }

        if ((table[1][0] == m) & (table[1][1] == m) & (table[1][2] == m)) {
            return true;
        }
        if ((table[2][0] == m) & (table[2][1] == m) & (table[2][2] == m)) {
            return true;
        }
        if ((table[0][0] == m) & (table[1][0] == m) & (table[2][0] == m)) {
            return true;
        }
        if ((table[0][1] == m) & (table[1][1] == m) & (table[2][1] == m)) {
            return true;
        }
        if ((table[0][2] == m) & (table[1][2] == m) & (table[2][2] == m)) {
            return true;
        }
        if ((table[0][0] == m) & (table[1][1] == m) & (table[2][2] == m)) {
            return true;
        }
        if ((table[0][2] == m) & (table[1][1] == m) & (table[2][0] == m)) {
            return true;
        }
        return false;
    }

    boolean checkForDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] != 'x' & table[i][j] != 'o') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the game Tic Tac Toe!" + "\nThe players make turn each after each." + "\nThis is the field of play.");
        TicTacToe1 board = new TicTacToe1();
        board.showField();

        do {
            System.out.println("Enter the number of field's cell: ");
            Scanner input = new Scanner(System.in);
            char user = input.next().charAt(0);

            System.out.println("Enter your choice 'o' or 'x': ");
            Scanner in = new Scanner(System.in);
            char turn = in.next().charAt(0);

            board.playerTurn(user, turn);

            if (board.checkWinner(turn)) {
                System.out.println("The winner is the player whose turn is " + turn);
                System.out.println("Congratulations! You won!");
                break;
            }

            if (board.checkForDraw()){
                System.out.println("Draw! Try again.");
                break;
            }
        }
        while (true);
    }
}
