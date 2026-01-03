package models.python;

import models.Node;

import java.util.ArrayList;

public class Func extends Node {

    Node decorator;
    Node funcName;
    ArrayList<Node> funcArgs;
    Node funcBlock;

    public Func(Node decorator, Node funcName, ArrayList<Node> funcArgs, Node funcBlock) {
        this.decorator = decorator;
        this.funcName = funcName;
        this.funcArgs = funcArgs;
        this.funcBlock = funcBlock;
    }

    @Override
    public String toString() {
        return "- function" +
                "\nfunc name: " + funcName.toString() + "\n" +
                (decorator != null ? "func decorator: " + decorator.toString() : "") + "\n" +
                (funcArgs != null ? "func args: " + funcArgs : "") + "\n" +
                (funcBlock != null ? "``````` func body start ```````\n" + funcBlock.toString() + "\n``````` func body end ```````": "")
                ;
    }

//    @Override
//    public String print(int level) {
//
//        return "func name: " + funcName.toString() + "\n" +
//                (decorator != null ? "func decorator: " + decorator.toString() : "") + "\n" +
//                (funcArgs != null ? "func args: " + funcArgs : "") + "\n" +
//                (funcBlock != null ? "func boyd: " + funcBlock.toString() : "")
//                ;
//    }
//        String indent = getIndent(level);
//
//        StringBuilder args = new StringBuilder();
//
//        if (funcArgs != null) {
//            for (int i = 0; i < funcArgs.size(); i++) {
//                args.append(funcArgs.get(i).toString());
//
//                if (i + 1 < funcArgs.size())
//                    args.append(", ");
//            }
//        }
//
//
//        return "func block\n" +
//                (decorator == null ?
//                        (funcBlock == null ?
//                                (funcArgs == null
//                                        ? indent + "└─ line no: " + lineNumber + "\n"
//                                        : indent + "├─ line no: " + lineNumber + "\n"
//                                        + indent + "└─ args: " + args.toString() + "\n"
//                                ) :
//                                (funcArgs == null
//                                        ? indent + "├─ line no: " + lineNumber + "\n"
//                                        + indent + "└─ func body " + funcBlock.print(level + 2)
//                                        : indent + "├─ line no: " + lineNumber + "\n"
//                                        + indent + "├─ args: " + args.toString() + "\n"
//                                        + indent + "└─ func body " + funcBlock.print(level + 2)
//                                )
//                        ) :
//                        (funcBlock == null ?
//                                (funcArgs == null
//                                        ? indent + "├─ line no: " + lineNumber + "\n"
//                                        + indent + "└─ decorator: " + decorator.print(level + 2)
//                                        : indent + "├─ line no: " + lineNumber + "\n"
//                                        + indent + "├─ args: " + args.toString() + "\n"
//                                        + indent + "└─ decorator: " + decorator.print(level + 2)
//                                ) :
//                                (funcArgs == null
//                                        ? indent + "├─ line no: " + lineNumber + "\n"
//                                        + indent + "├─ decorator: " + decorator.print(level + 2)
//                                        + indent + "└─ func body: " + funcBlock.print(level + 2)
//                                        : indent + "├─ line no: " + lineNumber + "\n"
//                                        + indent + "├─ args: " + args.toString() + "\n"
//                                        + indent + "├─ decorator: " + decorator.print(level + 2)
//                                        + indent + "└─ func body: " + funcBlock.print(level + 2)
//                                )
//                        )
//                );
//
//    }
}
