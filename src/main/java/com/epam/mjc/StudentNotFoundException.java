package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException() {
        super("Could not find student with ID ");
    }
}