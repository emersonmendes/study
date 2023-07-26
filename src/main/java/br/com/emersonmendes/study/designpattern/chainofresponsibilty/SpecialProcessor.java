package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

public class SpecialProcessor extends Processor {

    public SpecialProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() == 28) {
            System.out.println("Esse é a data do Bê!");
        } else {
            super.process(request);
        }
    }

}
