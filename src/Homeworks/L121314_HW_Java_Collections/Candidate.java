package Homeworks.L121314_HW_Java_Collections;

public class Candidate {
    private int identificationNr;
    private String name;
    private String party;
    int countVote = 0;

    Candidate(int id, String n, String p){
        identificationNr = id;
        name = n;
        party = p;
    }

    public int getIdentificationNr() {
        return identificationNr;
    }

    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }

    @Override
    public String toString() {
        return "ID = " + identificationNr + "\nName: " + name + "\nParty: " + party + "\nNumber of votes: " + countVote;
    }
}
