package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void process(Number request) {

        if (request.number() > 0) {
            System.out.println("PositiveProcessor : " + request.number());
            return;
        }

        super.process(request);

    }
}