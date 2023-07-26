package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

public class Processor {

    private final Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void process(Number request) {
        if (nextProcessor != null){
            nextProcessor.process(request);
        }
    }

}