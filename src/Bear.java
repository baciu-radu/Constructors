public class Bear {
    String species;
    public Bear(String speciesOfBear) {

        species = speciesOfBear;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "species='" + species + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bear baloo = new Bear("Sloth bear");
        System.out.println(baloo); // Prints: Bear@4517d9a3
        // set object to null
        baloo = null;
        System.out.println(baloo); // Prints: null
    }
}