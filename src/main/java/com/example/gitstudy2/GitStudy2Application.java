package com.example.gitstudy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitStudy2Application {

    public static void main(String[] args) {
        JavaProgrammer java = new JavaProgrammer();
        CProgrammer c = new CProgrammer();
        PythonProgrammer python = new PythonProgrammer();
        JavaScriptProgrammer javascript = new JavaScriptProgrammer();
        writeCode(javascript);
        writeCode(c);
        writeCode(python);
    }

    public static void writeCode(Programmer programmer) {
        programmer.writeCode();
    }
}