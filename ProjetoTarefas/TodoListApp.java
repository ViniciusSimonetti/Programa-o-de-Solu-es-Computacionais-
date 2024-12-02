import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TodoListApp extends JFrame {
    // Campos para entrada de dados
    private JTextField tfTitle, tfDescription;
    private JFormattedTextField tfDueDate;
    private JCheckBox cbStatus;

    // Listas e modelo para a tabela
    private ArrayList<Task> tasks = new ArrayList<>();
    private DefaultListModel<String> taskListModel = new DefaultListModel<>();
    private JList<String> taskList;

    // Botões
    private JButton btnAdd, btnEdit, btnDelete, btnShowAll, btnShowPending, btnShowCompleted;

    public TodoListApp() {
        // Configurações da janela principal
        setTitle("Sistema de Gerenciamento de Tarefas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra a janela na tela
        setLayout(new BorderLayout());

        // Painel de entrada de dados
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2, 5, 5));

        tfTitle = new JTextField();
        tfDescription = new JTextField();
        tfDueDate = new JFormattedTextField("####-##-##"); // Formato de data
        cbStatus = new JCheckBox("Concluída");

        inputPanel.add(new JLabel("Título:"));
        inputPanel.add(tfTitle);
        inputPanel.add(new JLabel("Descrição:"));
        inputPanel.add(tfDescription);
        inputPanel.add(new JLabel("Data de Vencimento:"));
        inputPanel.add(tfDueDate);
        inputPanel.add(new JLabel("Status:"));
        inputPanel.add(cbStatus);

        // Painel de controle com botões
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        btnAdd = new JButton("Adicionar");
        btnEdit = new JButton("Editar");
        btnDelete = new JButton("Excluir");
        btnShowAll = new JButton("Mostrar Todas");
        btnShowPending = new JButton("Mostrar Pendentes");
        btnShowCompleted = new JButton("Mostrar Concluídas");

        controlPanel.add(btnAdd);
        controlPanel.add(btnEdit);
        controlPanel.add(btnDelete);
        controlPanel.add(btnShowAll);
        controlPanel.add(btnShowPending);
        controlPanel.add(btnShowCompleted);

        // Lista de Tarefas
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Adicionando os painéis à janela
        add(inputPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Ações dos botões
        btnAdd.addActionListener(e -> addTask());
        btnEdit.addActionListener(e -> editTask());
        btnDelete.addActionListener(e -> deleteTask());
        btnShowAll.addActionListener(e -> showAllTasks());
        btnShowPending.addActionListener(e -> showPendingTasks());
        btnShowCompleted.addActionListener(e -> showCompletedTasks());
    }

    // Adicionar tarefa
    private void addTask() {
        String title = tfTitle.getText();
        String description = tfDescription.getText();
        String dueDate = tfDueDate.getText();
        boolean status = cbStatus.isSelected();

        if (title.isEmpty() || description.isEmpty() || dueDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        Task task = new Task(title, description, dueDate, status);
        tasks.add(task);
        taskListModel.addElement(task.toString());
        clearFields();
    }

    // Editar tarefa
    private void editTask() {
        int index = taskList.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para editar.");
            return;
        }

        Task selectedTask = tasks.get(index);
        tfTitle.setText(selectedTask.getTitle());
        tfDescription.setText(selectedTask.getDescription());
        tfDueDate.setText(selectedTask.getDueDate());
        cbStatus.setSelected(selectedTask.isCompleted());

        // Remover tarefa antiga e atualizar
        tasks.remove(index);
        taskListModel.remove(index);
    }

    // Excluir tarefa
    private void deleteTask() {
        int index = taskList.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para excluir.");
            return;
        }

        tasks.remove(index);
        taskListModel.remove(index);
    }

    // Mostrar todas as tarefas
    private void showAllTasks() {
        taskListModel.clear();
        for (Task task : tasks) {
            taskListModel.addElement(task.toString());
        }
    }

    // Mostrar tarefas pendentes
    private void showPendingTasks() {
        taskListModel.clear();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                taskListModel.addElement(task.toString());
            }
        }
    }

    // Mostrar tarefas concluídas
    private void showCompletedTasks() {
        taskListModel.clear();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                taskListModel.addElement(task.toString());
            }
        }
    }

    // Limpar campos
    private void clearFields() {
        tfTitle.setText("");
        tfDescription.setText("");
        tfDueDate.setText("");
        cbStatus.setSelected(false);
    }
}  