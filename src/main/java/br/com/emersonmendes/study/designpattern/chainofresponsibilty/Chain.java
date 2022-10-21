package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

public class Chain {

    private Processor chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        PositiveProcessor positiveProcessor = new PositiveProcessor(null);
        ZeroProcessor zeroProcessor = new ZeroProcessor(positiveProcessor);
        chain = new NegativeProcessor(zeroProcessor);
    }

    public void process(Number request) {
        chain.process(request);
    }

}
