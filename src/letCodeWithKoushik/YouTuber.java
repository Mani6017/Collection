package letCodeWithKoushik;

public class YouTuber {
	
	public static void main(String[] args) {
		YouTuber yu = new YouTuber();
		boolean rc = yu.uploadVideo();
		System.out.println(rc);
		
		String rw = yu.uploadVideo("");
		System.out.println("videoId : " + rw);
		
		int ri = yu.uploadVideo(2, 4);
		System.out.println("videoid : " + ri);
		
	}
         public void createVideo(){
        	 System.out.println("creating video");
         }
         private boolean uploadVideo() {
        	 return true;
         }
         private String uploadVideo(String videoId) {
        	 return "agfhh34";
         }
         private int uploadVideo(int a, int b) {
        	 return a + b;
         }
         
         
         String sharedVideo() {
        	 return "facebbok";
         }
}
