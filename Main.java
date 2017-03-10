public class Main {
    public static Music getInformation(){
        Music music = new Music();
        music.setTitle("Title 1");
        music.setYear("1990");
        music.setAuthor("Author 1");
        return music;
    }

    public static void main (String[] args) {
        Music model = getInformation();
        MusicView view = new MusicView();
        MusicController controller = new MusicController(model, view);
        controller.updateView();
        System.out.println("---UPDATE---");
        controller.setTrackTitle("TITLE 2");
//        controller.setTrackYear("1970");
//        controller.setTrackAuthor("AUTHOR 2");
        controller.updateView();
    }

}
