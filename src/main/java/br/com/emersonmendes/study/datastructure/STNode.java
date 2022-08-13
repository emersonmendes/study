package br.com.emersonmendes.study.datastructure;

import java.util.ArrayList;
import java.util.List;

public class STNode {

    private String text;
    private List<STNode> children;
    private int position;

    public STNode(String word, int position) {
        this.text = word;
        this.position = position;
        this.children = new ArrayList<>();
    }

    public String getText() {
        return text;
    }


    public List<STNode> getChildren() {
        return children;
    }

    public int getPosition() {
        return position;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setChildren(List<STNode> children) {
        this.children = children;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
