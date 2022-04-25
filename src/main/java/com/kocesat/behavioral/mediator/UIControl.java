package com.kocesat.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandler() {
        eventHandlers.forEach(eh -> eh.handle());
    }
//    protected DialogBox owner;

//    public UIControl(DialogBox owner) {
//        this.owner = owner;
//    }
}
