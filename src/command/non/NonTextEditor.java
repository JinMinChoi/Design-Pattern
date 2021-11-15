package command.non;

public class NonTextEditor {
    private Copier copier;
    private Paster paster;
    private Cutter cutter;
    private Skill skill;

    public NonTextEditor(Copier copier, Paster paster, Cutter cutter) {
        this.copier = copier;
        this.paster = paster;
        this.cutter = cutter;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void useEditor() {
        switch (this.skill) {
            case COPIER:
                copier.copy();
                break;
            case PASTER:
                paster.paste();
                break;
            case CUTTER:
                cutter.cut();
                break;
        }
    }
}
