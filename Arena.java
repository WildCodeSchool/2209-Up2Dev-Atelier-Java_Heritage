
class Arena {

    public static void main(String[] args) {

        WaterMonster monstreA = new WaterMonster("A", 3);
        FireMonster monstreB = new FireMonster("Monstre de feu A", 2);

        monstreA.setLife(42);

        // jusqu'à ce que 1 des 2 soit ko
        // Tant que les 2 ne sont pas KO

        while (monstreA.getLife() > 0 && monstreB.getLife() > 0) {

            boolean isMonstreAKo = monstreB.attack(monstreA);

            if (!isMonstreAKo) {
                monstreA.attack(monstreB);
            }

        }

        System.out.println("Fin du combat.");

    }
}