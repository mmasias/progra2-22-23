package Classes.Menu;
import Interfaces.MenuItem;

public class Options {
    MenuItem studentOptionOne = new MenuItemImpl("Option 1", () -> System.out.println("Option 1 selected"));
    MenuItem studentOptionTwo = new MenuItemImpl("Option 2", () -> System.out.println("Option 2 selected"));
    MenuItem quit = new MenuItemImpl("Quit", () -> System.exit(0));
    private MenuItem[] studentOptions = {studentOptionOne, studentOptionTwo, quit};
    MenuItem teacherOptionOne = new MenuItemImpl("Option 1", () -> System.out.println("Option 1 selected"));
    MenuItem teacherOptionTwo = new MenuItemImpl("Option 2", () -> System.out.println("Option 2 selected"));
    private MenuItem[] teacherOptions = {teacherOptionOne, teacherOptionTwo, quit};
    MenuItem adminOptionOne = new MenuItemImpl("Option 1", () -> System.out.println("Option 1 selected"));
    MenuItem adminOptionTwo = new MenuItemImpl("Option 2", () -> System.out.println("Option 2 selected"));
    private MenuItem[] adminOptions = {adminOptionOne, adminOptionTwo, quit};

    public MenuItem[] getStudentOptions() {
        return studentOptions;
    }
    public void setStudentOptions(MenuItem[] options) {
        this.studentOptions = options;
    }

    public MenuItem[] getAdminOptions() {
        return adminOptions;
    }
    public void setAdminOptions(MenuItem[] options) {
        this.adminOptions = options;
    }

    public MenuItem[] getTeacherOptions() {
        return teacherOptions;
    }
    public void setTeacherOptions(MenuItem[] options) {
        this.teacherOptions = options;
    }
}
