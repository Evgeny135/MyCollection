package main;

public class Main {
    public static void main(String[]args){
        MyArrayList emploees = new MyArrayList();
        emploees.add("Nikita");
        emploees.add("Igor");
        emploees.add("Antoha");
        emploees.add("Nikita");
        emploees.add("Andrey");
        emploees.add("Masha");
        emploees.add("Zhenya");
        emploees.remove("Igor");
        for (int i =0 ; i< emploees.getSize(); i++){
            System.out.println(emploees.get(i));
        }
    }
}
