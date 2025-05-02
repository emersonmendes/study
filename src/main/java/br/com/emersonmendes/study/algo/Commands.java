package br.com.emersonmendes.study.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Commands {

    public static void main(String[] args) {

        List<List<String>> commands = new ArrayList<>();
        commands.add(Arrays.asList("Insert", "Emerson"));
        commands.add(Arrays.asList("Left", "6"));
        commands.add(Arrays.asList("Right", "6"));
        commands.add(Arrays.asList("Print", "5"));

        List<String> results = simulateEditor(commands);

        for (String output : results) {
            System.out.println(output);
        }

    }

    private static List<String> simulateEditor(List<List<String>> commands) {

        List<String> results = new ArrayList<>();

        var text = "";
        var cursor = 0;

        for (var command : commands) {

            var action = command.getFirst();
            var value = command.get(1);

            switch (action) {
                case "Insert" -> {
                    text = text.substring(0, cursor) + value + text.substring(cursor);
                    cursor += value.length();
                }
                case "Left" -> {
                    cursor = cursor - Integer.parseInt(value);
                }
                case "Right" -> {
                    cursor = cursor + Integer.parseInt(value);
                }
                case "Delete" -> {
                    text = text.substring(0, cursor) + text.substring(cursor + Integer.parseInt(value));
                }
                case "Print" -> {
                    results.add(text.substring(0, cursor));
                }
                case "Backspace" -> {
                    text = text.substring(0, cursor - Integer.parseInt(value)) + text.substring(cursor);
                    cursor--;
                }
            }
        }

        return results;

    }

}
