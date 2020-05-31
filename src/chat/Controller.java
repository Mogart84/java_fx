package chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    public TextArea txtArea;

    @FXML
    public TextField txtField;

    @FXML
    public Button btnSend;

    public void clickBtnSend(ActionEvent actionEvent) {
        txtArea.appendText(txtField.getText() + "\n");
        txtField.clear();
    }

    public void enterTxtField(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            txtArea.appendText(txtField.getText() + "\n");
            txtField.clear();
        }

    }
}
