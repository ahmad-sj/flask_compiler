package models.jinja.blocks.inheritedBlock;

import models.jinja.blocks.JinjaBlock;

public class InheritedBlock extends JinjaBlock {
    InheritedBlockStartStatement inheritedBlockStartStatement;
    InheritedBlockEndStatement inheritedBlockEndStatement;
    InheritedBlockBody inheritedBlockBody;

    public InheritedBlock(InheritedBlockStartStatement inheritedBlockStartStatement, InheritedBlockBody inheritedBlockBody, InheritedBlockEndStatement inheritedBlockEndStatement) {
        this.inheritedBlockStartStatement = inheritedBlockStartStatement;
        this.inheritedBlockEndStatement = inheritedBlockEndStatement;
        this.inheritedBlockBody = inheritedBlockBody;
    }

    @Override
    public String toString() {
        return inheritedBlockStartStatement.toString()
                + (this.inheritedBlockBody == null ? "" : "\n" + inheritedBlockBody.toString())
                + "\n" + inheritedBlockEndStatement.toString() + "\n";
    }
}
