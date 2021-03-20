import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Team {
    public List<Player> getAllPlayers() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        listPlayer.add(new Player("Marc-Andre ter Stegen", 1, Position.GK));
        listPlayer.add(new Player("Sergino Dest", 2, Position.DF));
        listPlayer.add(new Player("Gerard Pique", 3, Position.DF));
        listPlayer.add(new Player("Ronald Araujo", 4, Position.DF));
        listPlayer.add(new Player("Sergio Busquets", 5, Position.MF));
        listPlayer.add(new Player("Antoine Griezmann", 6, Position.FW));
        listPlayer.add(new Player("Miralem Pjanic", 7, Position.MF));
        listPlayer.add(new Player("Martin Braithwaite", 8, Position.FW));
        listPlayer.add(new Player("Lionel Messi", 9, Position.FW));
        listPlayer.add(new Player("Ousmane Dembele", 10, Position.FW));
        listPlayer.add(new Player("Riqui Puig", 11, Position.MF));
        listPlayer.add(new Player("Neto", 12, Position.GK));
        listPlayer.add(new Player("Clement Lenglet", 13, Position.DF));
        listPlayer.add(new Player("Pedri", 14, Position.MF));
        listPlayer.add(new Player("Francisco Trincao", 15, Position.FW));
        listPlayer.add(new Player("Jordi", 16, Position.DF));
        listPlayer.add(new Player("Matheus Fernandes", 17, Position.MF));
        listPlayer.add(new Player("Sergi Roberto", 18, Position.DF));
        listPlayer.add(new Player("Frenkie de Jong", 19, Position.MF));
        listPlayer.add(new Player("Ansu Fati", 20, Position.FW));
        listPlayer.add(new Player("Samuel Umtiti", 21, Position.DF));
        listPlayer.add(new Player("Junior Firpo", 22, Position.DF));
        return listPlayer;
    };

    public List<Player> buildTeam() {

        ArrayList<Player> list = new ArrayList<Player>();

        int numGK = 0;
        int numDF = 0;
        int numMF = 0;
        int numFW = 0;

        Random random = new Random();

        boolean runnable = true;

        while (runnable){
        while(numGK<1) {
        int randomGK = random.nextInt(22);
            if (listPlayer.get(randomGK).getPosition().equals(Position.GK)) {
                    list.add(listPlayer.get(randomGK));
                    numGK++;
                }
            }
        while(numDF<4) {
        int randomDF = random.nextInt(22);
            if(listPlayer.get(randomDF).getPosition().equals(Position.DF) && !list.contains(listPlayer.get(randomDF))){
                    list.add(listPlayer.get(randomDF));
   
                    numDF++;
                }
            }
        while(numMF<4) {
        int randomMF = random.nextInt(22);
            if (listPlayer.get(randomMF).getPosition().equals(Position.MF) && !list.contains(listPlayer.get(randomMF))) {
                    list.add(listPlayer.get(randomMF));
                    numMF++;
                }
            }
        while(numFW<2){
        int randomFW = random.nextInt(22); 
            if (listPlayer.get(randomFW).getPosition().equals(Position.FW) && !list.contains(listPlayer.get(randomFW))){
                    list.add(listPlayer.get(numFW));
                    numFW++;
                }
            }

            System.out.println("\nDo you want to see another option? Type Y or N: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("Y")) {
                runnable = true;
            } else {
                runnable = false;
            }
        }
        
        for (int i =0; i<list.size();i++){
            System.out.println(list);}

        return list;

    }

}


