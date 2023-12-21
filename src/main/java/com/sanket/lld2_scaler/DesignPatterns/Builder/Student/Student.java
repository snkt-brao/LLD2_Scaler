package com.sanket.lld2_scaler.DesignPatterns.Builder.Student;

public class Student {
    private int rollNumber;
    private String name;
    private String address;
    private String email;
    private String mobileNumber;
    private String motherName;
    private double attendance;
    private double problemSolvingPercentage;
    private int problemsSolved;
    private int problemsAttended;
    private double score;

    private Student(Builder builder) {
        this.rollNumber = builder.getRollNumber();
        this.name = builder.getName();
        this.address = builder.getAddress();
        this.email = builder.getEmail();
        this.mobileNumber = builder.getMobileNumber();
        this.motherName = builder.getMotherName();
        this.attendance = builder.getAttendance();
        this.problemSolvingPercentage = builder.getProblemSolvingPercentage();
        this.problemsAttended = builder.getProblemsAttended();
        this.problemsSolved = builder.getProblemsAttended();
        this.score = builder.getScore();
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public double getAttendance() {
        return attendance;
    }

    public double getProblemSolvingPercentage() {
        return problemSolvingPercentage;
    }

    public int getProblemsSolved() {
        return problemsSolved;
    }

    public int getProblemsAttended() {
        return problemsAttended;
    }

    public double getScore() {
        return score;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    static class Builder {
        private int rollNumber;
        private String name;
        private String address;
        private String email;
        private String mobileNumber;
        private String motherName;
        private double attendance;
        private double problemSolvingPercentage;
        private int problemsSolved;
        private int problemsAttended;
        private double score;

        public Student build() {
            return new Student(this);
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public Builder setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public String getMotherName() {
            return motherName;
        }

        public Builder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public double getAttendance() {
            return attendance;
        }

        public Builder setAttendance(double attendance) {
            this.attendance = attendance;
            return this;
        }

        public double getProblemSolvingPercentage() {
            return problemSolvingPercentage;
        }

        public Builder setProblemSolvingPercentage(double problemSolvingPercentage) {
            this.problemSolvingPercentage = problemSolvingPercentage;
            return this;
        }

        public int getProblemsSolved() {
            return problemsSolved;
        }

        public Builder setProblemsSolved(int problemsSolved) {
            this.problemsSolved = problemsSolved;
            return this;
        }

        public int getProblemsAttended() {
            return problemsAttended;
        }

        public Builder setProblemsAttended(int problemsAttended) {
            this.problemsAttended = problemsAttended;
            return this;
        }

        public double getScore() {
            return score;
        }

        public Builder setScore(double score) {
            this.score = score;
            return this;
        }
    }
}
