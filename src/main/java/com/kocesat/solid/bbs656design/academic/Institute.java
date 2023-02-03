package com.kocesat.solid.bbs656design.academic;

import com.kocesat.solid.bbs656design.academic.program.impl.GraduateProgram;

public class Institute {
    private GraduateProgram program;

    public Institute(GraduateProgram program) {
        this.program = program;
    }

    public GraduateProgram getProgram() {
        return program;
    }

    public void setProgram(GraduateProgram program) {
        this.program = program;
    }
}
