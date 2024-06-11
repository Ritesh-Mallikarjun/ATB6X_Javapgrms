package ATB_6X_May;

public class Dog {
    String dogName;
    String dogBreed;
    double height;
    double weight;
    String color;
    String dogNatureType;

    public Dog(){
        System.out.println("this dog has no details , so its default constructor");
    }

    public Dog(String dogName, String dogBreed, double height, double weight, String color, String dogNatureType) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.dogNatureType = dogNatureType;
    }

    public void setDogBreed(String dogBreed){
       this.dogBreed=dogBreed;
    }

    void sit(){
        System.out.println(dogBreed+" This dog loves to sit!!!");
    }
    void stand(){
        System.out.println(dogBreed+" the dog loves to stand!!");
    }
    void bark(){
        System.out.println(dogBreed+" the dog loves to bark!!!");
    }

    void run(){
        System.out.println(dogBreed+" the dog loves to run fast");
    }

    public void bite() {
        System.out.println("this dog can bite severely due to its aggressive and ferrocious behavior");
    }

    void jump(){
        System.out.println("this dog loves to jump to greater heights");
    }

    void eat(String item){
        System.out.println(dogBreed+" this dog loves to eat "+item);
    }

    String handShake(String treat){
        if(treat.equalsIgnoreCase("treat"))
            return "Handshake";
        else
            return "No Handshake";
    }


}
