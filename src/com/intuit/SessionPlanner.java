package com.intuit;

public class SessionPlanner implements Session {

    private  String topic1;
    private String topic2;
    private String topic3;
    private String topic4;
    private String topic5;
    private String topic6;
    private String topic7;

    public void setTopic1(String topic1) {
        this.topic1 = topic1;
    }

    public void setTopic2(String topic2) {
        this.topic2 = topic2;
    }

    public void setTopic3(String topic3) {
        this.topic3 = topic3;
    }

    public void setTopic4(String topic4) {
        this.topic4 = topic4;
    }

    public void setTopic5(String topic5) {
        this.topic5 = topic5;
    }

    public void setTopic6(String topic6) {
        this.topic6 = topic6;
    }

    public void setTopic7(String topic7) {
        this.topic7 = topic7;
    }

    public String getTopic1() {
        return topic1;
    }

    public String getTopic2() {
        return topic2;
    }

    public String getTopic3() {
        return topic3;
    }

    public String getTopic4() {
        return topic4;
    }

    public String getTopic5() {
        return topic5;
    }

    public String getTopic6() {
        return topic6;
    }

    public String getTopic7() {
        return topic7;
    }


    @Override
    public void session45() {
        System.out.println("Session for 45 minutes are"+topic2+" and "+getTopic6());
    }

    @Override
    public void session50() {
        System.out.println("Session for 50 minutes are"+getTopic3()+" and "+getTopic4()+ " and "+ getTopic7());
    }

    @Override
    public void session60() {
        System.out.println("Session for 60 minutes are"+getTopic1()+" and "+getTopic5());
    }
}
