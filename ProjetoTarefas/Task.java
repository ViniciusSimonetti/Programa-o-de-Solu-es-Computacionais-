 // Classe Task (representando cada tarefa)
 public class Task {
    private String title;
    private String description;
    private String dueDate;
    private boolean completed;

    public Task(String title, String description, String dueDate, boolean completed) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return title + " - " + dueDate + (completed ? " [Concluída]" : " [Pendente]");
    }
}
