package assignment5;

interface voiceAssistant {
    void voiceCommand(String command);
}
interface  textAssistant {
    void textCommand(String command);
}
public class SmartAssistant implements voiceAssistant, textAssistant {
    @Override
    public void voiceCommand(String command) {
        System.out.println("Voice Command: " + command);
    }

    @Override
    public void textCommand(String command) {
        System.out.println("Text Command: " + command);
    }

    public static void main(String[] args) {
        SmartAssistant assistant = new SmartAssistant();
        assistant.voiceCommand("Speaking Open Google");
        assistant.textCommand("Texting Open Google");
    }
}
