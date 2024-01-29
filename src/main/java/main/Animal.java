package main;

public class Animal {
    String name;
    int age;
    String species;

    public Animal(){
        name= "";
        age= 0;
        species= "";

    }
    public void setSpecies(String x){
        species = x;
    }
    public void setName(String y){
        name = y;
    }
    public void setAge(String z){
        age =Integer.parseInt(z);            
    }

}
