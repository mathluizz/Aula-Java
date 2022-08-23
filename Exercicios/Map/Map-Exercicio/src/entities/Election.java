package entities;

import java.util.Objects;

public class Election {
    private String name;
    private Integer qntVotes;

    public Election(){}
    public Election(String name, Integer qntVotes) {
        this.name = name;
        this.qntVotes = qntVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQntVotes() {
        return qntVotes;
    }

    public void setQntVotes(Integer qntVotes) {
        this.qntVotes = qntVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Election election = (Election) o;
        return Objects.equals(name, election.name) && Objects.equals(qntVotes, election.qntVotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, qntVotes);
    }
}
