package Game;
import java.util.Random;

public class Class_character {

    public int[] currentLevel = {1,2,3,4,5};
    public int[] requiredXP = {20,60,120,240};

    public int XP = 0;
    public int level;

    private int HP;
    private int ATT;
    private int DEF;
    private int MANA;


    public void Mage(int HP, int ATT, int DEF, int MANA) {
        this.HP = HP;
        this.ATT = ATT;
        this.DEF = DEF;
        this.MANA = MANA;
    }

    public void Ghoul(int HP, int ATT, int DEF, int MANA) {
        this.HP = HP;
        this.ATT = ATT;
        this.DEF = DEF;
        this.MANA = MANA;
    }

    public void Goblin(int HP, int ATT, int DEF, int MANA) {
        this.HP = HP;
        this.ATT = ATT;
        this.DEF = DEF;
        this.MANA = MANA;
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
