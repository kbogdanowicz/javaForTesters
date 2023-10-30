package model;

import model.BugReporter;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

    private String bugDescription;
    private BugReporter bugreporter;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String bugDescription, BugReporter bugreporter, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugreporter = bugreporter;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Bug description need to have mote than 10 chars");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public BugReporter getBugreporter() {
        return bugreporter;
    }

    public void setBugreporter(BugReporter bugreporter) {
        this.bugreporter = bugreporter;
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default: {
                System.out.println("Incorrect bug priority range");
            }
        }
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        notifyStatusChange();
        this.bugStatus = bugStatus;
    }

    public void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + " bug reporter: " + bugreporter + " bug priority: " + bugPriority + " bug status: " + bugStatus);
    }

    public void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugreporter=" + bugreporter +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority && bugStatus == bug.bugStatus && Objects.equals(bugDescription, bug.bugDescription) && Objects.equals(bugreporter, bug.bugreporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugreporter, bugPriority, bugStatus);
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("!!! Bug status has changed !!!");
    }

    @Override
    public int compareTo(Bug bug) {
       return this.getBugDescription().compareTo(bug.getBugDescription());
    }
}
