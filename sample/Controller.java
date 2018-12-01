package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button addNewTaskBtn;

    @FXML
    public void initialize() {
        addNewTaskBtn.setDisable(true);
    }
}
