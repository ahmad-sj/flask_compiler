package models.jinja.blocks.inheritedBlock;

import models.jinja.blocks.JinjaBlock;

public class InheritedBlock extends JinjaBlock {
    InheritedBlockStart inheritedBlockStart;
    InheritedBlockEnd inheritedBlockEnd;
    InheritedBlockBody inheritedBlockBody;

    public InheritedBlock(InheritedBlockStart inheritedBlockStart, InheritedBlockBody inheritedBlockBody, InheritedBlockEnd inheritedBlockEnd) {
        this.inheritedBlockStart = inheritedBlockStart;
        this.inheritedBlockEnd = inheritedBlockEnd;
        this.inheritedBlockBody = inheritedBlockBody;
    }

    @Override
    public String toString() {
        return inheritedBlockStart.toString()
                + (this.inheritedBlockBody == null ? "" : "\n" + inheritedBlockBody.toString())
                + "\n" + inheritedBlockEnd.toString() + "\n";
    }
}
