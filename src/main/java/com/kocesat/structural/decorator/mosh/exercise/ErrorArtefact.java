package com.kocesat.structural.decorator.mosh.exercise;

public class ErrorArtefact implements Iconable {
    private Iconable artefact;

    public ErrorArtefact(Iconable artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return String.format("%s %s", artefact.render(), "[Error]");
    }
}
