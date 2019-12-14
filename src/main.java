import repository.repository;
import repository.repositoryInterface;
import view.userInterface.textUI;
import view.userInterface.ui;

public class main {
    public static void main(String[] args) {
        repositoryInterface repo = new repository();
        ui userInterface = new textUI(repo);
        userInterface.run();
    }
}

