package sh.owl.javaFxSampleApp.mainWindow.controls.imageContainer;

import javafx.scene.layout.BorderPane;
import sh.owl.javaFxSampleApp.utils.FXMLView;

public class SweetButton extends BorderPane implements FXMLView<BorderPane> {
    public SweetButton() {
        load(true);
    }
}
