package com.kocesat.structural.decorator.mosh.exercise;

/**
 * Decorator over Artefact
 */
public class ChangedArtefact implements Iconable {
    private Iconable artefact;

    public ChangedArtefact(Iconable artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return String.format("%s %s", artefact.render(), "[changed]");
    }
}
