package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

public class Chain {

    private Processor chain;

    public Chain(){
        PositiveProcessor positiveProcessor = new PositiveProcessor(null);
        SpecialProcessor specialProcessor = new SpecialProcessor(positiveProcessor);
        ZeroProcessor zeroProcessor = new ZeroProcessor(specialProcessor);
        chain = new NegativeProcessor(zeroProcessor);
    }

    public void process(Number request) {
        if(request.getNumber() == 9999){
            throw new RuntimeException("The chain was broken!");
        }
        chain.process(request);
    }

}
