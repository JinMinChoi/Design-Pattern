package command.adapt;

public class NewUser {
    public static void main(String[] args) {
        Copier copier = new Copier();
        Paster paster = new Paster();
        Cutter cutter = new Cutter();

        EditorCommand copyCommand = new CopyCommand(copier);
        PasteCommand pasteCommand = new PasteCommand(paster);
        CutCommand cutCommand = new CutCommand(cutter);

        // 문서 편집기 가동
        TextEditor textEditor = new TextEditor();

        // 복사
        textEditor.setEditorCommand(copyCommand);
        textEditor.useEditor();

        //붙혀넣기
        textEditor.setEditorCommand(pasteCommand);
        textEditor.useEditor();

        //자르기
        textEditor.setEditorCommand(cutCommand);
        textEditor.useEditor();
    }
}
