class FireMonster extends Monster {

    public FireMonster(String name, int attack) {
        super(name, attack, "fire");
    }

    public boolean attack(Monster opponent) {

        int opponentLife = opponent.getLife();
        int damage = this.getAttack();

        if (opponent.getType().equals("air")) {
            damage = damage * 2;
        }

        int remainingLife = opponentLife - damage;
        opponent.setLife(remainingLife);

        boolean isOpponentKo = opponent.isKO();
        return isOpponentKo;

    }
}