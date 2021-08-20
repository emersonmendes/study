package br.com.emersonmendes.study.designpattern.adapter;

public class PeruAdapter implements Duck {

    private final Peru peru;

    public PeruAdapter(Peru peru){
        this.peru = peru;
    }

    @Override
    public String grasnar(){
        return peru.soar(); /* MÉTODO DE PERU SENDO UTILIZADO DE FORMA ADAPTADA */
    }

    @Override
    public String voar(){
        return peru.voar(); /* MÉTODO DE PERU SENDO UTILIZADO DE FORMA ADAPTADA */
    }

}