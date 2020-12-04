package com.example.jagdish;

import java.util.ArrayList;

public class ToDoOne {
    private String mName;
    private boolean mOnline;

    public ToDoOne(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    private static int taskno = 0;

    public static ArrayList<ToDoOne> createContactsList(int numContacts) {
        ArrayList<ToDoOne> todos = new ArrayList<ToDoOne>();

        for (int i = 1; i <= numContacts; i++) {
            todos.add(new ToDoOne("Task : " + ++taskno, i <= numContacts / 2));
        }
        return todos;
    }
}
