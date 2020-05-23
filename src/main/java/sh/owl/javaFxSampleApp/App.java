package sh.owl.javaFxSampleApp;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import sh.owl.javaFxSampleApp.mainWindow.MainWindow;

@Slf4j
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) {
        log.atInfo().log("Javafx hype!");

        log.atDebug().log("Loading Main Window");
        Parent root = new MainWindow().load(false);

        Scene scene = new Scene(root, 1280, 720);

        window.setTitle("JavaFx Sample App");
        window.setScene(scene);
        window.show();
    }
}
