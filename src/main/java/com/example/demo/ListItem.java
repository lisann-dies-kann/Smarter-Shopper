package com.example.demo;

import jakarta.persistence.*;

@Entity
public class ListItem {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private boolean checked;



    public ListItem(){}

    public String getName() {
        return name;
    }
    public boolean getChecked() {return checked;}
    public int getId() {return id;}

    public ListItem(int id, String name, boolean checked) {
        this.id = id;
        this.name = name;
        this.checked = checked;
    }

    public ListItem(String name) {
        this.name = name;
        this.id = (int) (Math.random() * 1000); // Generiere eine zufällige ID
        this.checked = false; // Standardmäßig auf "nicht erledigt" setzen
    }


    public void setChecked() {
        this.checked = !checked;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
