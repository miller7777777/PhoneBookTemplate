package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mille_000 on 07.06.2015.
 */
public class PhoneBook {

    private BufferedReader reader;
    private Contact contact;
    private String answer;
    private int choose;

    public void start(){

        //выводит меню в бесконечном цикле

        reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            System.out.println("");
            System.out.println("Phonebook menue:");
            System.out.println("1 - add new contact");
            System.out.println("2 - delete contact by phone");
            System.out.println("3 - show all contact");
            System.out.println("4 - find contact by phone");
            System.out.println("5 - edit contact by phone");
            System.out.println("6 - exit");
            System.out.println("");
            System.out.println("Input command:");

            try {
                answer = reader.readLine();
                choose = Integer.parseInt(answer);
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (choose){

                case 1: {
                    addContact();
                    break;
                }
                case 2: {
                    deleteByPhone();
                    break;
                }
                case 3: {
                    showAll();
                    break;
                }
                case 4: {
                    findByPhone();
                    break;
                }
                case 5: {
                    editByPhone();
                    break;
                }
                case 6: {
                    close();
                    break;
                }
                default: {
                    System.out.println("Wrong input!");
                    break;
                }
            }

        }

    }

    private void close() {
        try {
            reader.close();
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editByPhone() {
    }

    private void findByPhone() {

    }

    private void showAll() {
    }

    private void deleteByPhone() {

    }

    private void addContact() {

    }
}
