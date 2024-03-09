package com.example.lab06;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ChatMessage {

    @ColumnInfo(name = "message")
    protected String message;

    @ColumnInfo(name = "TimeSent")
    protected String timeSent;

    @ColumnInfo(name = "SendOrReceive")
    protected  String sendOrReceive;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    protected int id;

    // insert chat message

    // list all messages

    // delete chat message



}
