package fightors;

public class Monster
{
    // variables d'instance
    private int health;
    private String name;
    private Knight knight;

    /**
     * Constructeur d'objets de classe Monster
     * @param
     * @param knight
     */
    public Monster(Knight knight)
    {
        this.knight = knight;
        // initialisation des variables d'instance
        this.health = 10;
        this.name = "monster";
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setName(String name){
        this.name = name;
    }

    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

    /***
     *
     * @param damage Le nombre de vie du monstre après avoir attaqué
     * @return le nombre de vie restant
     */
    public int attacked(int damage)
    {
        // Insérez votre code ici
        return this.health -= damage;
    }


}
