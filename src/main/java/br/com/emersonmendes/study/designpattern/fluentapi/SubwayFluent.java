package br.com.emersonmendes.study.designpattern.fluentapi;

import java.util.Objects;

public class SubwayFluent {

    static SubwayFluent.SubwayBread size(int size){
        if(size <= 0){
            throw new IllegalArgumentException("Size should be greater than 0.");
        }
        return new SubwayDSL(size);
    }

    interface SubwayBread {
        SubwayMeat bread(String bread);
    }

    interface SubwayMeat {
        SubwayCheese meat(String meat);
    }

    interface SubwayCheese {
        SubwayHeated cheese(String cheese);
    }

    interface SubwayHeated {
        SubwaySalad heated(boolean heated);
    }

    interface SubwaySalad {
        SubwaySauce salad(String salad);
    }

    interface SubwaySauce {
        SubwayBuild sauce(String sauce);
    }

    interface SubwayBuild {
        Subway build();
    }

//    private int size;
//    private String bread;
//    private String meat;
//    private String cheese;
//    private boolean heated;
//    private String salad;
//    private String sauce;

}
