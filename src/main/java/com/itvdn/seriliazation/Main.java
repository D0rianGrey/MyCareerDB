package com.itvdn.seriliazation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Eugene");
        File file = new File("C:\\Users\\utyfd\\IdeaProjects\\MyCareerDB\\src\\main\\java\\com\\itvdn\\seriliazation\\output.txt");
        //ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream());
    }
}
