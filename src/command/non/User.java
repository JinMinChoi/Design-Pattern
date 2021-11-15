package command.non;

public class User {
    public static void main(String[] args) {
        Copier copier = new Copier();
        Paster paster = new Paster();
        Cutter cutter = new Cutter();

        NonTextEditor nonTextEditor = new NonTextEditor(copier, paster, cutter);

        nonTextEditor.setSkill(Skill.COPIER);
        nonTextEditor.useEditor();

        nonTextEditor.setSkill(Skill.PASTER);
        nonTextEditor.useEditor();

        nonTextEditor.setSkill(Skill.CUTTER);
        nonTextEditor.useEditor();
    }
}
