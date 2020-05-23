package sh.owl.javaFxSampleApp.mainWindow.controls.menuBar;

import javafx.application.Platform;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SweetMenuBarController {
    public void onClose() {
        log.atInfo().log("Closing");
        Platform.exit();
    }
}
