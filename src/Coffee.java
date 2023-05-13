class Coffee {

    public Coffee() {

    }

    public static void addSugar(int sugarCubes) {
        System.out.println("Added " + sugarCubes + " sugar cubes!");
    }

    public static String isGood(boolean good) {
        if (good == true) {
            return "Coffee goooood";
        } else return "Coffee baaaad";
    }

    public static void main(String[] args) {
//        Coffee myCup = new Coffee();
        addSugar(7);
        System.out.println(isGood(false));
    }

}
