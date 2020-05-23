package sh.owl.javaFxSampleApp.mainWindow.controls.imageContainer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SweetButtonController {

    @FXML Button button;

    @FXML
    public void initialize() {
        log.atInfo().log("Button " + button.getText());
    }

    public void buttonClicked() {
        log.atInfo().log("CLICKED");
    }
}
