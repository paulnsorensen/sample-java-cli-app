package sample.app;

import java.io.BufferedReader;
import java.io.IOException;

public class CommandHandler {
    private final BufferedReader reader;

    public CommandHandler(BufferedReader reader) {
        this.reader = reader;
    }

    public void processCommands() {
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                System.out.println("Your command was: " + line);
            }
        } catch (IOException e) {
            System.err.println("Command input failed to be read");
            e.printStackTrace();
        }

        System.out.println("\n\nAll commands processed!");
    }
}
