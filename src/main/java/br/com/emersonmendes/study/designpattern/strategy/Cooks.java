package br.com.emersonmendes.study.designpattern.strategy;

public enum Cooks implements Cook {

    ITALIAN {
        @Override
        public String prepare() {
            return "Making pizza!";
        }
    },
    BRAZILAN {
        @Override
        public String prepare() {
            return "Making feijoada!";
        }
    };

}
