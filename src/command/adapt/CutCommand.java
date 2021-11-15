package command.adapt;

public class CutCommand implements EditorCommand {
    private Cutter cutter;

    public CutCommand(Cutter cutter) {
        this.cutter = cutter;
    }

    @Override
    public void useEditor() {
        cutter.cut();
    }
}
