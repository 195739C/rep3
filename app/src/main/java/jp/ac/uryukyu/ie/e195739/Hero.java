package jp.ac.uryukyu.ie.e195739;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        
        if (dead)
             return;
        
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName, damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
    
    /**
     * フィールド変数nameにアクセスすgetterメソッド
     * @return enemyの名前
     */
    
    public String getName() {
         return this.name;
     }
    
    /**
     * フィールド変数nameに値を代入するsetterメソッド
     * @param name  enemyの名前
     */

     public void setName(String name) {
         this.name = name;
     }

    /**
     * フィールド変数hitPointにアクセスするgetterメソッド
     * @return　enemyの現在のHP
     */
    
     public int getHitPoint() {
         return this.hitPoint;
     }
    
    /**
     * フィールド変数hitPointに値を代入するsetterメソッド
     * @param hitPoint　enemyのHP
     */

     public void setHitPoint(int hitPoint) {
         this.hitPoint = hitPoint;
     }

    /**
     * フィールド変数attackにアクセスするgetterメソッド
     * @return　enemyの攻撃力
     */
    
     public int getAttack() {
         return this.attack;
     }
    
    /**
     * フィールド変数(attack)に値を代入するsetterメソッド
     * @param attack　enemyの攻撃力
     */

     public void setAttack(int attack) {
         this.attack = attack;
     }
    
    /**
     * フィールド変数deadにアクセスするgetterメソッド
     * @return　enemyの生死の状態
     */

     public boolean getDead() {
         return this.dead;
     }
    
    /**
     * フィールド変数(dead)に値を代入するsetterメソッド
     * @param dead enemyの生死の状態
     */

     public void setDead(boolean dead) {
         this.dead = dead;
     }
    
}
