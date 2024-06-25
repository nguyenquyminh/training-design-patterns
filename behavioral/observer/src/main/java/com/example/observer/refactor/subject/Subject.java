package com.example.observer.refactor.subject;

import com.example.observer.refactor.observer.Observer;

public interface Subject {

  void attach(Observer observer);

  void detach(Observer observer);

  void notifyAllObserver();
}
