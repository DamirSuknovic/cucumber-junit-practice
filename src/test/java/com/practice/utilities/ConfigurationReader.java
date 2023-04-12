package com.practice.utilities;

import java.io.*;
import java.util.*;

public class ConfigurationReader {

    // 1- Create the object of Properties
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}
