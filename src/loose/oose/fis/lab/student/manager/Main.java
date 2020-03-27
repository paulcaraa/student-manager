package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
<<<<<<< HEAD:src/loose/oose/fis/lab/student/manager/Main.java
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("FIS - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
=======

    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));

        primaryStage.setTitle("FIS - Student Manager");

        primaryStage.setScene(new Scene(root, 600, 400));

>>>>>>> 156ad7ba24135ed8b1766efe968b87016d75d724:src/loose/oose/fis/lab/student/manager/Main.java
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}