import java.io.FileWriter;
import java.io.IOException;

public class Event extends Task{
        protected String at;
        public Event (String taskName, boolean taskDone, String at)
        {
            super(taskName, taskDone); // calls the parent constructor
            this.at = at;
        }

        public String toString()
        {
            return "[E]" + super.toString() + " (at: "+ at + ")";
        }

    public void write(FileWriter storage) throws IOException {
        storage.write("E\n"); //to represent as todo
        super.write(storage);
        storage.write(at + "\n");
    }

}
