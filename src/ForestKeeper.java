public class ForestKeeper {

    private String speech;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getSpeech() {
        speech = "Лесник: " + getText();
        return speech;


    }
}
