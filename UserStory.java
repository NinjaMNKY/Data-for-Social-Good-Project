public class UserStory{

private Game[] gamesArray;
/*
  * Reads the data from titlefile, scorefile, and
* genrefile to initialize the 1D array answers
*/
  public UserStory(String titlesFile, String scoreFile, String genreFile){
gamesArray= createGames(titlesFile, scoreFile, genreFile);
  }
/*
*this creates a game object using data from tiltle.txt, score.txt, and genre.txt
*/ 
public Game[] createGames(String titlesFile, String scoreFile, String genreFile){
String[] title = FileReader.toStringArray(titlesFile);
double[] score = FileReader.toDoubleArray(scoreFile);
String[] genre = FileReader.toStringArray(genreFile);
Game[] tempGames = new Game[title.length];

for (int i= 0; i < tempGames.length; i++){
  tempGames[i] = new Game(title[i], score[i], genre[i]);
}
return tempGames;
  }
 /*
 *This returns an array of all of the gamesArray with the same specified genre.
 */
public Game[] getGenreGame(String targetGenre) {
    // Find the number of matching gamesArray
    int count = 0;
    for (Game game : gamesArray) {
        if (game.getGenre().equals(targetGenre)) {
            count++;
        }
    }
    // Creates an array for the matching games with the same genre
    Game[] genreGames = new Game[count];
    int index = 0;

    for (Game game : gamesArray) {
        if (game.getGenre().equals(targetGenre)) {
  genreGames[index++] = game;
 System.out.println(game); // Print each matching game object 
   }
    }
    return genreGames;
}
/*
*This counts the number of times a the target genre shows up in the list
*/
  public int countGenre(String targetGenre) {
    int count = 0;

    for (Game response : gamesArray) {
     if (response.getGenre().equals(targetGenre)) {
        count++;
      }
    }

    return count;
  }

  
/*
*Returns a String containing the information of each game
*/
public String toString(){
  String result = "";
  
    for (Game game  : gamesArray) {
      result += game;
    }
    return result;
  }
}
