package view.userInterface;

import controller.controller;
import controller.controllerInterface;
import exception.exception;
import model.collection.map.map;
import model.collection.map.mapInterface;
import repository.repositoryInterface;
import view.command.*;

import java.util.Iterator;
import java.util.Scanner;

public class textUI implements ui{
    private controllerInterface ctrl;
    private Scanner console = new Scanner(System.in);
    private mapInterface<String, Command> commands;

    public textUI(repositoryInterface repo) {
        this.ctrl = new controller(repo);
        this.commands = new map<String, Command>();
        this.addCommand(new exitCommand("exit", "exit the program", this.ctrl));
        this.addCommand(new inputCommand("input", "choose a hardcoded program to run", this.ctrl));
        this.addCommand(new allStepsCommand("all steps", "executes all steps of the current program", this.ctrl));
    }

    public void run() {
        System.out.println("\n---------------- Type help to get help ----------------\n");
        while (true) {
            System.out.print(">");
            //String userInput = System.console().readLine();
            String userInput = this.console.nextLine();
            if (userInput.equals("help")) {
                System.out.println(this.help());
            } else if (this.commands.getKeys().has(userInput)) {
                try {
                    this.commands.get(userInput).execute();
                } catch (exception ignored){}
            } else {
                System.out.println("wrong input");
            }
        }
    }

    private String help() {
        String toReturn = "This is the help menu.\n" +
                "These are the available functions:\n";
        for (Iterator<String> it = this.commands.getKeys().iterator(); it.hasNext(); ) {
            try {
                Command current = this.commands.get(it.next());
                toReturn += current.toString();
            } catch (exception exception) {
                System.out.println("ERROR : in Commands iterator");
            }
        }
        return toReturn;
    }

    public void addCommand(Command command) {
        this.commands.put(command.getKey(), command);
    }
}
