package command.adapt;

public class PasteCommand implements EditorCommand {
    private Paster paster;

    public PasteCommand(Paster paster) {
        this.paster = paster;
    }

    @Override
    public void useEditor() {
        paster.paste();
    }
}
