package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import static util.ScreenUtil.getURL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ScreenController.setRootScene(primaryStage);

        ScreenController.addScreen("test", FXMLLoader.load(getURL("sample.fxml")));

        ScreenController.activate("test");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
