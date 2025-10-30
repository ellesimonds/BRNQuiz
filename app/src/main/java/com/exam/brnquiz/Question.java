package com.exam.brnquiz;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    List<String> answers;

    {
        answers = new ArrayList<String>();
    }
    //wouldn't compile:
    // answers.add {"Medellin", "Madrid", "Paris", "Bogota"};
    private int index = 3; //index of correct answer

    public Question() {
    }
}
