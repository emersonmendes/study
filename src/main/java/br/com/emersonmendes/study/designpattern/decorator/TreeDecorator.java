package br.com.emersonmendes.study.designpattern.decorator;

public abstract class TreeDecorator implements ChristmasTree {

    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }

}