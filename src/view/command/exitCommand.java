package view.command;

import exception.exception;
import controller.controllerInterface;

public class exitCommand extends Command {
    public exitCommand(String key, String description, controllerInterface ctrl) {
        super(key, description, ctrl);
    }

    @Override
    public void execute() throws exception{
        this.ctrl.close();
        System.exit(0);
    }
}
