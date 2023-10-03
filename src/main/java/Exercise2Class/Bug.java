package Exercise2Class;

public class Bug {

    String bugDescription;
    String email;
    int bugPriority;
    boolean bugStatus;

    public Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = true;
    }

    void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + " email: " + email + " bug priority: " + bugPriority + " bug status: " + bugStatus);
    }

    void showEmail() {
        System.out.println("Reporter's email: " + email);
    }

    int getPriority() {
        return bugPriority;
    }

    void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
    }

}
