package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static  final String DB_NAME = "postgres";
    private static  final String DB_password = "1593578246";
    private static  final String DB_URL = "jdbc:postgresql://localhost:5432/testDB";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Connection connection= DriverManager.getConnection(DB_NAME, DB_password, DB_URL);
	    while(true) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("0");

            int command = scanner.nextInt();

            try {
                if(command == 1) {System.out.println("1"); }
                if(command == 2) {System.out.println("2"); }
                if(command == 3) {System.out.println("3"); }
                if(command == 4) {System.out.println("4"); }
                if(command == 0) {break; }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
