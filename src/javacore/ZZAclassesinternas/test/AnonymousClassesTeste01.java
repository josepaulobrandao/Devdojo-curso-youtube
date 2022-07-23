package javacore.ZZAclassesinternas.test;

class AnimalTeste{
    public void walk() {
        System.out.println("Animal walking");
    }
}

class Cachorro extends AnimalTeste {
    @Override
    public void walk() {
        System.out.println("Cachorro walking");
    }
}


public class AnonymousClassesTeste01 {
    public static void main(String[] args) {
        AnimalTeste animal = new AnimalTeste(){
            @Override
            public void walk() {
                System.out.println("Wlaking in the shadows");
            }
        };
        animal.walk();
    }
}
