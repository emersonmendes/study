package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

class ZeroProcessor extends Processor {

    public ZeroProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void process(Number request) {

        if (request.number() == 0) {
            System.out.println("ZeroProcessor : " + request.number());
            return;
        }

        super.process(request);

    }

}