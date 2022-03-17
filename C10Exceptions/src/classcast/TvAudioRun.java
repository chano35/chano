package classcast;

public class TvAudioRun {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Audio audio = new Audio();
		
		castTv("tv", tv);
		castAudio("audio", audio);
		
		castRemoteControl("tv", tv);
		castRemoteControl("audio", audio);
	}

	static void castTv(String title, RemoteControl rc) {
		try {
			Tv tv = (Tv)rc;
			System.out.printf("%s는 TV입니다.\n", title);
		}
		catch(ClassCastException e) {
			System.out.printf("%s는 TV가 아닙니다.\n", title);
		}
	}
	
	static void castAudio(String title, RemoteControl rc) {
		try {
			Audio audio = (Audio)rc;
			System.out.printf("%s는 Audio입니다.\n", title);
		}
		catch(ClassCastException e) {
			System.out.printf("%s는 Audio가 아닙니다.\n", title);
		}
	}
	
	static void castRemoteControl(String title, RemoteControl rc) {
		if(rc instanceof Tv) {
			Tv tv = (Tv)rc;
			System.out.printf("%s는 TV입니다.\n", title);
		}
		else if(rc instanceof Audio) {
			Audio audio = (Audio)rc;
			System.out.printf("%s는 Audio입니다.\n", title);
		}
		else {
			System.out.printf("%s는 Tv도 Audio도 아닙니다.\n", title);
		}
	}

}