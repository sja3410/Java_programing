
class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song() {
		
	}
	public Song(String title, String artist, String album, String[] composer, int year, int track)
	{
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	void show()
	{
		System.out.println("���� : "+this.title);
		System.out.println("���� : "+this.artist);
		System.out.println("�ٹ� ���� : "+this.album);
		for(int i = 0; i<composer.length; i++) {
			System.out.println("�۰"+(i+1)+" : "+this.composer[i]);
		}
		System.out.println("��ǥ ���� : "+this.year);
		System.out.println("Ʈ�� ��ȣ : "+this.track);
		
		
	}
}
