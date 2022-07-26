package com.kocesat.structural.decorator.mosh.exercise;

public class Editor {
    public void openProject(String path) {
        Iconable[] artefacts = {
                new MainArtefact(new ChangedArtefact(new Artefact("Main"))),
                new Artefact("Demo"),
                new ErrorArtefact(new Artefact("EmailClient")),
                new ChangedArtefact(new Artefact("EmailProvider")),
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
