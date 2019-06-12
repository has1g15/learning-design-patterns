package Adapter;

public class TestEnemyAttackers {

    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();
        EnemyRobot enemyRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("The robot");
        enemyRobot.reactToHuman("Hannah");
        enemyRobot.walkForward();
        enemyRobot.smashWithHands();

        System.out.println("The enemy tank");
        enemyTank.assignDriver("Hannah");
        enemyTank.driveForward();
        enemyTank.fireWeapon();

        System.out.println("The robot with adapter");
        robotAdapter.assignDriver("Hannah");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
