package models.jinja.blocks.forBlock;

import models.jinja.blocks.JinjaBlock;

public class ForBlock extends JinjaBlock {
    ForBlockStartStatement forBlockStartStatement;
    ForBlockBody forBlockBody;
    ForBlockEndStatement forBlockEndStatement;

    public ForBlock(ForBlockStartStatement forBlockStartStatement, ForBlockBody forBlockBody, ForBlockEndStatement forBlockEndStatement) {
        this.forBlockStartStatement = forBlockStartStatement;
        this.forBlockBody = forBlockBody;
        this.forBlockEndStatement = forBlockEndStatement;
    }

    @Override
    public String toString() {
        return forBlockStartStatement.toString()
                + "\n" + forBlockBody.toString()
                + "\n" + forBlockEndStatement.toString();
    }
}
