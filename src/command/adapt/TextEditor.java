package command.adapt;

public class TextEditor {
    private EditorCommand editorCommand;

    public void setEditorCommand(EditorCommand editorCommand) {
        this.editorCommand = editorCommand;
    }

    public void useEditor() {
        editorCommand.useEditor();
    }
}
