package plgn;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class MyMailTask extends DefaultTask {
    private String to;

    @Input // means that it is required task param
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @TaskAction
    public void sendMail() throws Exception {
        getLogger().lifecycle("Sending mail to " + to);
        System.out.println("Mail password is: " + getProject().getProperties().get("mailPassword"));
        System.out.println("sent");
    }
}