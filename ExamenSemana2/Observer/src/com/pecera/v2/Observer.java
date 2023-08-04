package com.pecera.v2;

public abstract class Observer {

    private Subject sub;

    public Observer(Subject sub) {
        this.sub = sub;
        this.sub.attach(this); // Se registra el observador con el sujeto.
    }

    // Método abstracto update: será implementado por las clases que hereden de Observer para reaccionar a las actualizaciones del sujeto.
    abstract void update();
}