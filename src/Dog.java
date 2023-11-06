public class Dog {
    String nume;
    String rasa;
    public Dog(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }
    public static void main(String[] args){
        Dog caine = new Dog("Simba", "Akita American");
        System.out.println(caine.nume + " " + caine.rasa);
    }
}