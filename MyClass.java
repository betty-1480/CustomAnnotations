package bettyHomeWork;

public class MyClass {

    @BettyCustomAnnotation
    private RandomChild randomChild;

   @BettyCustomAnnotation
   private String name;

    public void setRandomChild(RandomChild randomChild) {
        this.randomChild = randomChild;
    }


    @Override
    public String toString() {
        return "MyClass{" +
                "randomChild=" + randomChild +
                ", name='" + name + '\'' +
                '}';
    }
}
