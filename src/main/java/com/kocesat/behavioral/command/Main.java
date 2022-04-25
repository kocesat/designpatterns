package com.kocesat.behavioral.command;

import com.kocesat.behavioral.command.editor.BoldCommand;
import com.kocesat.behavioral.command.editor.History;
import com.kocesat.behavioral.command.editor.HtmlDocument;
import com.kocesat.behavioral.command.editor.UndoCommand;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello world");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println(document.getContent());
    }
}
