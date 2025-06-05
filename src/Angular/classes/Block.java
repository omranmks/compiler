package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
block:  LeftCurlyBrace
        blockContent*
        RightCurlyBrace;
 */
public class Block {
    List<BlockContent> blockContentList = new ArrayList<>();

    public List<BlockContent> getBlockContentList() {
        return blockContentList;
    }

    public void setBlockContentList(List<BlockContent> blockContentList) {
        this.blockContentList = blockContentList;
    }

    public void addBlockContent(BlockContent blockContent) {
        blockContentList.add(blockContent);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "Block { {";
        if (!blockContentList.isEmpty()) {
            for (BlockContent blockContent : blockContentList) {
                finalString += "\n";
                finalString += blockContent.toString();
            }
        }
        finalString += "\n} }";
        return finalString;
    }
}
