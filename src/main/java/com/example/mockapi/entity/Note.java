package com.example.mockapi.entity;

import javax.persistence.*;

@Entity
@Table(name="notes")
public class Note {

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", note='" + note + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(name="note")
    private String note;

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
