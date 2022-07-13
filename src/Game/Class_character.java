package Game;

public class Class_character {

    int[] currentLevel = {1,2,3,4,5};
    int[] requiredXP = {20,60,120,240};

    int XP = 0;
    int level;

    // ############## CHARACTERS ##############

    public class Warrior {
        int HP = 25;
        int ATT = 5;
        int DEF = 10;
        int VIT = 4;

        int currentLevel = 1;

    }

    public class Mage {
        int HP = 12;
        int ATT = 18;
        int DEF = 6;
        int VIT = 6;

        int currentLevel = 1;
    }

    // ############## LEVEL UP ##############
    public void LevelUp(){

        if( XP == requiredXP[0]){
            level = currentLevel[0];}

        else if ( XP == requiredXP[1]){
          level = currentLevel[1];}
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

}
