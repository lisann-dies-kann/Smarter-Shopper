package com.example.demo;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
public class ListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean checked;


    //Leerer Konstruktur für Hibernate
    public ListItem() {}

    public ListItem(String name) {
        this.name = name;
        this.checked = false; // Standardmäßig auf "nicht erledigt" setzen
    }

    public String getName() {
        return name;
    }
    public boolean getChecked() {return checked;}
    public Long getId() {return id;}

    public ListItem(Long id, String name, boolean checked) {
        this.id = id;
        this.name = name;
        this.checked = checked;
    }




    public void setChecked() {
        this.checked = !checked;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
