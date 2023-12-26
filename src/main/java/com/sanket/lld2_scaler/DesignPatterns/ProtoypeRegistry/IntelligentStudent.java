package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry;

public class IntelligentStudent extends Student {
    private double psp;
    private double attendance;
    private int totalQuestionsSovled;
    private int totalQuestionsAttepmted;
    private int leaderboardRank;

    public IntelligentStudent(int rollNumber, String firstName, String lastName, String email, String mobileNumber, double psp, double attendance, int totalQuestionsSovled, int totalQuestionsAttepmted, int leaderboardRank) {
        super(rollNumber, firstName, lastName, email, mobileNumber);
        this.psp = psp;
        this.attendance = attendance;
        this.totalQuestionsSovled = totalQuestionsSovled;
        this.totalQuestionsAttepmted = totalQuestionsAttepmted;
        this.leaderboardRank = leaderboardRank;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.psp = intelligentStudent.psp;
        this.attendance = intelligentStudent.attendance;
        this.totalQuestionsSovled = intelligentStudent.totalQuestionsSovled;
        this.totalQuestionsAttepmted = intelligentStudent.totalQuestionsAttepmted;
        this.leaderboardRank = intelligentStudent.leaderboardRank;
    }



    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
