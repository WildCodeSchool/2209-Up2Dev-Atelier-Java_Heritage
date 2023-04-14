class WaterMonster extends Monster {

    public WaterMonster(String name, int attack) {
        super("Monstre d'eau " + name, attack, "water");
    }

    public boolean attack(Monster opponent) {

        int opponentLife = opponent.getLife();
        int damage = this.getAttack();

        if (opponent.getType().equals("fire")) {
            damage = damage * 2;
        }

        int remainingLife = opponentLife - damage;
        opponent.setLife(remainingLife);

        boolean isOpponentKo = opponent.isKO();
        return isOpponentKo;

    }
}