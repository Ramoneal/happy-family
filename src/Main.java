public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Dog","Rock",5,15,new String[]{"eat","drink","sleep"});
        pet.respond();
        Human mother = new Human("Jane","Karleone",21);
        Human father = new Human("Vito","Karleone",76);
        Human human = new Human("Michael","Karleone",25,75,pet,mother,father,null);
        human.describePet();
    }
}