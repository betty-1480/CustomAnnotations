package bettyHomeWork;

public class MyClass {

    @BettyCustomAnnotation
    private RandomChild randomChild;

   @BettyCustomAnnotation
   private String name;

    public void setRandomChild(RandomChild randomChild) {
        this.randomChild = randomChild;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "randomChild=" + randomChild +
                ", name='" + name + '\'' +
                '}';
    }
}
