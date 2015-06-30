package org.project.neutrino.nfvo.catalogue.nfvo;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * Created by lto on 03/06/15.
 */
public class ApplicationEventNFVO extends ApplicationEvent {
    private Action action;
    private Serializable payload;

    public Serializable getPayload() {
        return payload;
    }

    public void setPayload(Serializable payload) {
        this.payload = payload;
    }

    public ApplicationEventNFVO(Object source, Action action, Serializable payload) {
        super(source);
        this.action = action;
        this.payload = payload;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "ApplicationEventNFVO{" +
                "action=" + action +
                '}';
    }
}
