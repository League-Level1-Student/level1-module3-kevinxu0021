import javax.swing.JOptionPane;

public class Netflix {
	
public static void main(String[] args) {
	NetflixQueue netflixQueue = new NetflixQueue();
	Movie movie = new Movie("Movie", 5);
	Movie movie1 = new Movie("Movie1", 3);
	String a = movie.getTicketPrice();
	netflixQueue.addMovie(movie);
	netflixQueue.addMovie(movie1);
	JOptionPane.showMessageDialog(null, "The price of this movid is " + a);
	JOptionPane.showMessageDialog(null, "The best movie is " + netflixQueue.getBestMovie());
	JOptionPane.showMessageDialog(null, "The second best movie is " + netflixQueue.getMovie(1));
}
}
