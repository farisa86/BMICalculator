/**
 * Created by jc302404 on 23/03/15.
 */
public class Patients {
    Patient[] records;
    int current;

    public Patients(int maxsize){
        records = new Patient[maxsize];
    }

    public int count(){
        return current;
    }

    public void add(Patient patient ){
  records[current++] = patient;
    }

    public Patient get(int i){
        return records[i];
    }
    public boolean isFull(){
        return (current == records.length);
    }
}
