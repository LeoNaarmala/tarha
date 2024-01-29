package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Zoo zoo = new Zoo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna eläintarhalle nimi:");
        String Zname;
        Zname= sc.nextLine();
        zoo.setName(Zname);
        boolean exit = false;
        while(!exit){
            

            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i=Integer.parseInt(stringInput);

                switch(i){
                    case 1:
                    System.out.println("Mikä laji?");
                    String species;
                    species= sc.nextLine();
                    
                    System.out.println("Anna eläimen nimi:");
                    String name;
                    name= sc.nextLine();
                    
                    System.out.println("Anna eläimen ikä:");
                    String age;
                    age= sc.nextLine();
                    
                    zoo.addAnimal(species,name,age);
                
                    break;
                    case 2:
                    zoo.listAnimals();
                    break;
                    case 3:
                    zoo.runAnimals();
                    break;
                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit=true;
                    break;





                }

            }   
        }

        

        }

    private static void parseInt(String age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parseInt'");
    }


    }

