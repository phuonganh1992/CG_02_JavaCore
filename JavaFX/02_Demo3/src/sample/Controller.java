package sample;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField so1;
    @FXML
    TextField so2;
    @FXML
    TextField result;

    public void setResult() {
        Integer number1=Integer.parseInt(so1.getText());
        Integer number2=Integer.parseInt(so2.getText());
        Integer kq=number1+number2;
        result.setText(kq.toString());
    }
}
