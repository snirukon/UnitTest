package hacs;

import java.text.DateFormat;
import java.util.Date;

public class Assignment {

    protected String assignmentName;
    protected String strAssignmentFileName;
    protected Date dueDate = new Date();
    protected String assignmentSpec;
    protected SolutionList theSolutionList = new SolutionList();
    protected Solution suggestedSolution = new Solution();

    public Assignment() {
    }

    public void setDueDate(Date theDueDate) {
        this.dueDate = theDueDate;
    }

    public void setAssignmentSpec(String theSpec) {
        this.assignmentSpec = theSpec;
    }

    public boolean isOverDue() {
        Date today;
        today = new Date();
        return today.after(this.dueDate);
    }

    public Solution addSolution() {
        Solution mySolution = new Solution();
        return mySolution;
    }

    //// add the theSolution to the Solutionlist
    public void addSolution(Solution theSolution) {
        theSolutionList.add(theSolution);
    }

    public void submitSolution() {
    }

    public void getSolutionList() {
    }

    /*
     * return the solution of the give name
     */
    public Solution getSolution(String studentName) {
        SolutionIterator Iterator = new SolutionIterator(theSolutionList);
        return Iterator.next(studentName);
    }

    public Solution getSuggestedSolution() {
        return suggestedSolution;
    }

    public SolutionIterator getSolutionIterator() {
        SolutionIterator theSolutionIterator = new SolutionIterator(theSolutionList);
        return theSolutionIterator;
    }

    public String toString() {
        return assignmentName;
    }

    public String getDueDateString() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        return dateFormat.format(dueDate);
    }

    public void accept(NodeVisitor visitor) {
        visitor.visitAssignment(this);
    }
}