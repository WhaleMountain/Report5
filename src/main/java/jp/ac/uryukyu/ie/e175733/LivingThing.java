package jp.ac.uryukyu.ie.e175733;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    private int rand;

    public LivingThing(String name,int hitPoint,int attack){
        this.name=name;
        this.hitPoint=hitPoint;
        this.attack=attack;
        dead=false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead(){return dead;}

    public String getName(){return name;}

    public void attack(LivingThing opponent) {
        if (!isDead()) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.name, damage);
            opponent.wounded(damage);
        }
    }
    public void setHitPoint(int damage){this.hitPoint-=damage;}
    public int getHitPoint(){return hitPoint;}
    public void setDead(boolean dead){this.dead=dead;}
    public int getAttack(){return attack;}
    public void setRand(int rand){this.rand=rand;}
    public int getRand(){return rand;}

    public void wounded(int damage){
        hitPoint-=damage;
        if(hitPoint<=0) {
            System.out.printf("%sは倒れた。\n", this.name);
            this.dead=true;
        }
    }
}