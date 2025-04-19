import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.sound.sampled.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.layout.StackPane;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Program56 extends JFrame {

    private Image image;
    private AudioClip audioClip;

    public Program56() {
        // Set up the JFrame (Swing window)
        setTitle("Swing Media Example");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        // Load image
        image = new ImageIcon("path/to/your/image.jpg").getImage(); // Replace with your image path

        // Play audio
        try {
            File audioFile = new File("path/to/your/audio.wav"); // Replace with your audio file path
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the audio
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add a panel to the frame for drawing the image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (image != null) {
                    g.drawImage(image, 50, 50, this); // Draw image at position (50, 50)
                }
            }
        };
        add(panel, BorderLayout.CENTER);

        // Button to trigger video playing
        JButton videoButton = new JButton("Play Video");
        videoButton.addActionListener(e -> playVideo("path/to/your/video.mp4")); // Replace with your video path
        add(videoButton, BorderLayout.SOUTH);
    }

    // Method to play video using JavaFX (since Swing does not support video)
    private void playVideo(String videoPath) {
        // Launch JavaFX to play the video
        new Thread(() -> {
            Application.launch(VideoPlayer.class, videoPath);
        }).start();
    }

    public static void main(String[] args) {
        // Start Swing application
        SwingUtilities.invokeLater(() -> {
            MediaSwingApp app = new MediaSwingApp();
            app.setVisible(true);
        });
    }

    // JavaFX video player class
    public static class VideoPlayer extends Application {
        @Override
        public void start(Stage stage) {
            String videoPath = getParameters().getRaw().get(0);
            Media media = new Media(new File(videoPath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            MediaView mediaView = new MediaView(mediaPlayer);

            StackPane root = new StackPane();
            root.getChildren().add(mediaView);
            Scene scene = new Scene(root, 600, 400);

            stage.setTitle("Video Player");
            stage.setScene(scene);
            stage.show();

            mediaPlayer.play();
        }
    }
}
