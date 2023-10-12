import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {

        int minAge = 18;
        int maxAge = 40;

        int[] firstTeamPlayers = generateNumbers(minAge, maxAge);
        int[] secondTeamPlayers = generateNumbers(minAge, maxAge);

        System.out.println("Squad first team: ");
        showAll(firstTeamPlayers);

        System.out.println('\n' + "Squad second team: ");
        showAll(secondTeamPlayers);

        System.out.println('\n' + "Middle age of first squad team: ");
        averageAge(firstTeamPlayers);

        System.out.println('\n' + "Middle age of first squad team: ");
        averageAge(secondTeamPlayers);

    }

    //    Create method for find a middle age
    private static void averageAge(int[] squad) {
        int sum = 0;
        int middleAge;
        for (int element : squad)
            sum += element;
        middleAge = sum / squad.length;
        System.out.print(middleAge + " ");
    }

    //    Create method for show all elements of massive + age
    private static void showAll(int[] squad) {
        for (int number: squad) {
            System.out.print(number + " ");
        }
    }

    //    Create method for adding age to massive
    private static int[] generateNumbers(int minAge, int maxAge) {
        int[] squad = new int[25];
        for (int i = 0; i < squad.length; i++) {
            int randomAge = ThreadLocalRandom.current().nextInt(minAge, maxAge + 1);
            squad[i] = randomAge;
        }
        return squad;
    }

}