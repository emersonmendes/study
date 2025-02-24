package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

class NegativeProcessor extends Processor {

    public NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void process(Number request) {

        if (request.number() < 0) {
            System.out.println("NegativeProcessor : " + request.number());
            return;
        }

        super.process(request);

    }

}