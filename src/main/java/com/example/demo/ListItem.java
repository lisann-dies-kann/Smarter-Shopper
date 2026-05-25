package com.example.demo;



public class ListItem {
    private int id;
    private String name;
    private boolean checked;



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

    public ListItem(){
        this.id = (int) (Math.random() * 1000);
        this.checked = true;
    }


    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
