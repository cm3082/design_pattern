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
		System.out.println("��Ӱ���Ͽ�ʼ��!!!!!");
		movie.play();
		System.out.println("��Ӱ������!!!!!!");
	}

}
