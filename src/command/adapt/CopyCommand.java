package command.adapt;

public class CopyCommand implements EditorCommand {
    private Copier copier;

    public CopyCommand(Copier copier) {
        this.copier = copier;
    }

    @Override
    public void useEditor() {
        copier.copy();
    }
}
