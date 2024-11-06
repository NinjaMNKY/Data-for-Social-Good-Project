public class DataRunner {
  public static void main(String[] args) {
  UserStory r = new UserStory("title.txt", "score.txt", "genre.txt");

    
   Game[] actionAdventureGames = r.getGenreGame("Action-Adventure");
        
System.out.println("\nNumber of Action-Adventure Games: " + r.countGenre("Action-Adventure"));


  }
}