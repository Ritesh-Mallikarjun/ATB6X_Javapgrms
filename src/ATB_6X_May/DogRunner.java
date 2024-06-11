package ATB_6X_May;

public class DogRunner {
    public static void main(String[] args) {
        Dog german=new Dog("rocky","german",3.4,120.25,"brown","aggressive");
        Dog rajmouli=new Dog("raja","rajmouli",5.2 ,150.25,"white","very active");
        german.bark();
        german.bite();
        rajmouli.bark();
        rajmouli.jump();
        Dog pomorian=new Dog();
        german.setDogBreed("German Shepherd");
        german.eat("Pedigree Hybrid biscuits");
        rajmouli.run();
        String hshake=rajmouli.handShake("treat");
        System.out.println("the dog gave "+hshake);

    }
}
