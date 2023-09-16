package Design20ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public abstract class Observebla {
    private List<Observer> observerList;
    public Observebla(){
        observerList=new ArrayList<>();
    }
    public void ekle(Observer  observer){
        this.observerList.add(observer);
    }
    public void sil(Observer  observer){
        this.observerList.remove(observer);
    }
    public void update(){
        for (Observer observer: observerList) {
            observer.update(this);
        }
    }
}
