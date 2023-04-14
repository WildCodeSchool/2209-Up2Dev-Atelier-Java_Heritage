class AirMonster extends Monster {

    public AirMonster(String name, int attack) {
        super(name, attack, "air");
    }

    public boolean attack(Monster opponent) {

        int opponentLife = opponent.getLife();
        int damage = this.getAttack();

        if (opponent.getType().equals("water")) {
            damage = damage * 2;
        }

        int remainingLife = opponentLife - damage;
        opponent.setLife(remainingLife);

        boolean isOpponentKo = opponent.isKO();
        return isOpponentKo;

    }
}