package sh.owl.javaFxSampleApp.mainWindow.controls.menuBar;

import javafx.scene.control.MenuBar;
import lombok.extern.slf4j.Slf4j;
import sh.owl.javaFxSampleApp.utils.FXMLView;

@Slf4j
public class SweetMenuBar extends MenuBar implements FXMLView<MenuBar> {
    public SweetMenuBar() {
        load(true);
    }
}
