package Design01Sigleton;

public class SingletonDesign {
    private static SingletonDesign  singletonDesigns= new SingletonDesign();
    public SingletonDesign(){
        System.out.println("Singleton Nesnesi oluştu");
    }
    public static SingletonDesign getSingletonDesigns(){
        return singletonDesigns;
    }
}
