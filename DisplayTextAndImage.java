
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayTextAndImage extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Set the title of the window
        primaryStage.setTitle("Text and Image Display");

        // Create a label
        Label label = new Label("Hello, JavaFX!");

        // Load the image from the file
        Image image = new Image("file:imagePath.jpg");

        // Display the image using ImageView
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setFitHeight(250);
        imageView.setPreserveRatio(true);

        // Arrange the label and image vertically
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, imageView);

        // Create a scene with size 600 x 400
        Scene scene = new Scene(vbox, 600, 400);

        // Set the scene and display the window
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
