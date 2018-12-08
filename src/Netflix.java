import javax.swing.JOptionPane;

public class Netflix {

	public static void main(String[] args) {

		NetflixQueue netflixQueue = new NetflixQueue();

		Movie movie = new Movie("Movie", 5);
		Movie movie1 = new Movie("Movie1", 4);
		Movie movie2 = new Movie("Movie2", 3);
		Movie movie3 = new Movie("Movie3", 2);
		Movie movie4 = new Movie("Movie4", 1);

		String a = movie.getTicketPrice();
		System.out.println(a);

		netflixQueue.addMovie(movie);
		netflixQueue.addMovie(movie1);
		netflixQueue.addMovie(movie2);
		netflixQueue.addMovie(movie3);
		netflixQueue.addMovie(movie4);

		netflixQueue.printMovies();

		JOptionPane.showMessageDialog(null, "The price of this movie is " + a);
		JOptionPane.showMessageDialog(null, "The best movie is " + netflixQueue.getBestMovie());
		JOptionPane.showMessageDialog(null, "The second best movie is " + netflixQueue.getMovie(1));
	}
}
