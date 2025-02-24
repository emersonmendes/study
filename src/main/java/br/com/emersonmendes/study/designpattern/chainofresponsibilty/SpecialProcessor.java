package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

public class SpecialProcessor extends Processor {

    public SpecialProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(Number request) {

        if (request.number() == 28) {
            System.out.println("Esse é a data do Bê!");
            return;
        }

        super.process(request);

    }

}
