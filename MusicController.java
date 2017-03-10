public class MusicController {
    private Music model;
    private MusicView view;

    public MusicController(Music model, MusicView view){
        this.model = model;
        this.view = view;
    }
    public void setTrackTitle(String name){
        model.setTitle(name);
    }

    public String getTrackTitle(){
        return model.getTitle();
    }

    public void setTrackYear(String year){
        model.setYear(year);
    }

    public String getTrackYear(){
        return model.getYear();
    }

    public void setTrackAuthor(String author){
        model.setAuthor(author);
    }

    public String getTrackAuthor(){
        return model.getAuthor();
    }

    public void updateView() {
        view.printInformation(model.getTitle(), model.getYear(), model.getAuthor());
    }
}
