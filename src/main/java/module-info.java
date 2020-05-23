module JavaFxApp.main {
    requires javafx.graphics;
    requires org.slf4j;
    requires static lombok;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.swing;

    opens sh.owl.javaFxSampleApp;
    opens sh.owl.javaFxSampleApp.mainWindow;
    opens sh.owl.javaFxSampleApp.mainWindow.controls.menuBar;
    opens sh.owl.javaFxSampleApp.mainWindow.controls.imageContainer;
}