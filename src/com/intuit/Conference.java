package com.intuit;

public class Conference {
    SessionPlanner sessionPlanner;

    public void setSessionPlanner(SessionPlanner sessionPlanner) {
        this.sessionPlanner = sessionPlanner;
    }

    public void schedule(){
        sessionPlanner.session45();
        sessionPlanner.session50();
        sessionPlanner.session60();
    }
}
