class Animal {
    void soundmaker() {
        System.out.println("This is the animal's sound");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.soundmaker();
    }
}

class Dog extends Animal {

    void soundmaker() {
        System.out.println("Bark! Bark!");
    }
}
