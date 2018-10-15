package com.heroes.model;

import java.util.List;

public class Player {

    private String name;
    private Boolean canMove;
    private List<Unit> unitList = new ArrayList<Unit>();
    private int leftUnits;
    private boolean startsOnLeftSide;

    Player(String name1,Boolean canMove1){
        name = name1;
        canMove = canMove1;
    }

    public String getName() {
        return name;
    }
    public boolean getIfCanMove() {
        return canMove;
    }
    public int getLeftUnits() {
        return leftUnits;
    }
    public boolean getIfStartsOnLeftSide() {
        return startsOnLeftSide;
    }

    public void setIfCanMove(boolean yORn) {
        this.canMove = yORn;
    }


}
