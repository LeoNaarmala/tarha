package main;

import java.util.ArrayList;

public class Zoo {
    String name;
    Animal animal=new Animal();
    ArrayList<String> list = new ArrayList();
    public Zoo(){
        name= "";  

    }
    public void setName(String x){
        name=x;
    }


    public void addAnimal(String x, String y, String z){
        animal.setAge(z);
        animal.setName(y);
        animal.setSpecies(x);
        list.add(x+": "+y+", "+z+" vuotta");


    }
    public void listAnimals(){
        System.out.println(name+" pitää sisällään seuraavat eläimet:");
        for (String i : list){
            System.out.println(i);
        }

    }
    public void runAnimals(){
        
    }

}
