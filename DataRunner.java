public class DataRunner {
  public static void main(String[] args) {
  UserStory r = new UserStory("title.txt", "score.txt", "genre.txt");

    
   System.out.println("\nGames with Action-Adventure Genre:");

        Game[] actionAdventureGames = r.getGenreGame("Action-Adventure");
        for (Game game : actionAdventureGames) {
            System.out.println(game); 
        }
System.out.println("\nNumber of Action-Adventure Games: " + r.countGenre("Action-Adventure"));


  }
}