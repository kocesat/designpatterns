package com.kocesat.structural.decorator.mosh.exercise;

/**
 * Decorator
 */
public class MainArtefact implements Iconable{
    private Iconable artefact;

    public MainArtefact(Iconable artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return String.format("%s %s", artefact.render(), "[Main]");
    }
}
