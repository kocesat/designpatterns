package com.kocesat.solid.bbs656design.academic;

import com.kocesat.solid.bbs656design.academic.program.impl.UndergradProgram;

public class Faculty {
    private UndergradProgram program;

    public Faculty(UndergradProgram program) {
        this.program = program;
    }

    public UndergradProgram getProgram() {
        return program;
    }

    public void setProgram(UndergradProgram program) {
        this.program = program;
    }
}
