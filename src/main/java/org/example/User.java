package org.example;
import java.util.Scanner;
public class User {

        private String name;

        private Scanner user_input = new Scanner(System.in);

        public User(String name){
            this.name = name;
        }
        public String setNameFromInput(){
            System.out.println("Hey! What's your name?");
            this.name = user_input.nextLine();
            return name;
        }


    }

