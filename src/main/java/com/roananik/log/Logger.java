package com.roananik.log;


    import java.io.*;
    import java.util.ArrayList;
    import java.util.List;

    public class Logger {
        private static final String LOG_FILE_PATH = "log.txt";

        public static void main(String[] args) {

            try {
                new FileWriter(LOG_FILE_PATH, false).close();
            } catch (IOException e) {
                e.printStackTrace();
            }


            writeLog("INFO", "Starting JuniorCrudServiceApplication using Java 17.0.7");
            writeLog("DEBUG", "User admin created");


            System.out.println("All logs:");
            List<String> allLogs = readLogs();
            for (String log : allLogs) {
                System.out.println(log);
            }


            System.out.println("\nOnly INFO logs:");
            printLogsByLevel("INFO");
        }

        public static void writeLog(String level, String message) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE_PATH, true))) {
                writer.println(level + ": " + message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public static List<String> readLogs() {
            List<String> logs = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    logs.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return logs;
        }


        public static void printLogsByLevel(String level) {
            List<String> logs = readLogs();
            for (String log : logs) {
                if (log.startsWith(level)) {
                    System.out.println(log);
                }
            }
        }
    }

