package _17_Inheritance.Message;

public class FancyMessage extends Message{
    FancyMessage (String text) {
        super(text);
    }

    @Override
    protected String makePreFix() {
        return "[Fancy] ";
    }
    @Override
    public String format() {
        return makePreFix() + "★ " + text + " ★";

    }


}
