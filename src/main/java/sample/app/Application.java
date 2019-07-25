package sample.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
    private static final String FILE_OPTION_NAME = "-file=";

    public static void main(String[] args) {
        CommandHandler commandHandler;
        BufferedReader reader = null;

        // check for file argument
        if (args.length > 0
                && args[0] != null
                && !args[0].isEmpty()
                && args[0].startsWith(FILE_OPTION_NAME)) {

            // take argument prefix off
            String fileName = args[0].substring(FILE_OPTION_NAME.length());

            try {
                reader = Files.newBufferedReader(Paths.get(fileName));
            } catch (IOException e) {
                System.err.println("Unable to read input file");
                e.printStackTrace();
                System.exit(1);
            }
        }
        // stream STDIN
        else {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        commandHandler = new CommandHandler(reader);

        // process commands
        commandHandler.processCommands();
    }
}
