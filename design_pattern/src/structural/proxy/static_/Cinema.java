package structural.proxy.static_;

public class Cinema implements Movie{

	Movie movie;
	
	public Cinema(Movie movie) {
		// TODO Auto-generated constructor stub
		this.movie = movie;
	}



	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("电影马上开始了!!!!!");
		movie.play();
		System.out.println("电影结束了!!!!!!");
	}

}
