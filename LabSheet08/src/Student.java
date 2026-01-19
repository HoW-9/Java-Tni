public class Student {

    private String name; //- name:String
    private  int study_year; //- study_year:int
    private int score = 0; //- score:int = 0

    // + setName(name:String):void
    public void setName(String name){
        this.name = name;
    }
    // + getName():String
    public String getName(){
        return this.name;
    }
    // + setStudyYear(study_year:int):void
    public void setStudyYear(int study_year){
        this.study_year = study_year;
    }
    // + getStudyYear():int
    public int getStudyYear(){
        return this.study_year;
    }
    // + getScore():int
    public int getScore(){
        return this.score;
    }
    // + addPoint(point:int):void
    public void addPoint(int point){
        this.score += point;
        System.out.println(this.name + " got " + point + " points");
    }
    // + getGrade():String
    public String getGrade(){
        if(this.score >=50) return "A";
        else if(this.score >= 70)return "B";
        else if(this.score >= 60)return "C";
        return "F";
    }
}
