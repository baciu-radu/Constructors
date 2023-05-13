public class Cat {
    int age;
    String species;
    public Cat() {
        // instructions for creating a Cat instance
    }

    public Cat(int age, String species) {
        this.age = age;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", species='" + species + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // garfield is declared with reference data type `Cat`
        Cat garfield = new Cat();
        Cat garfield1 = new Cat(12, "Garfield");
        System.out.println(garfield); // Prints: Cat@76ed5528
        System.out.println(garfield1);
        Coffee.addSugar(3);
    }
}