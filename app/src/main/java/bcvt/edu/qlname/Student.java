package bcvt.edu.qlname;

public class Student {
    private int _studentid;
    private String _studentname;

    public Student(){

    }

    public Student(int id, String name){
        this._studentid = id;
        this._studentname = name;
    }

    public int getStudentID(){
        return this._studentid;
    }
    public void setStudentID(int id){
        this._studentid = id;
    }

    public String getStudentName(){
        return this._studentname;
    }
    public void setStudentName(String name){
        this._studentname = name;
    }
}
