package structural.proxy.static_;

public class Test {

	public static void main(String[] args) {
		Movie movie = new RealMovie();
		Cinema cinema = new Cinema(movie);
		cinema.play();
	}
}
