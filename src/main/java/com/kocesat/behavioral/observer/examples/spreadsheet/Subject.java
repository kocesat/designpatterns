package com.kocesat.behavioral.observer.examples.spreadsheet;

import java.util.ArrayList;
import java.util.List;

// Observable
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObservable(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

}
