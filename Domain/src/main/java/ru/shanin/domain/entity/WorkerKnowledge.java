package ru.shanin.domain.entity;

import java.util.ArrayList;

import ru.shanin.domain.entity.helpers.ConverterToString;

public class WorkerKnowledge {
    private final ArrayList<String> interestingKnowledge;
    private final ArrayList<String> ignoringKnowledge;

    public WorkerKnowledge(
            ArrayList<String> interestingKnowledge,
            ArrayList<String> ignoringKnowledge
    ) {
        this.interestingKnowledge = interestingKnowledge;
        this.ignoringKnowledge = ignoringKnowledge;
    }

    public ArrayList<String> getInterestingKnowledge() {
        return new ArrayList<>(interestingKnowledge);
    }

    public ArrayList<String> getIgnoringKnowledge() {
        return new ArrayList<>(ignoringKnowledge);
    }

    @Override
    public String toString() {
        return ConverterToString.makeJsonString(this);
    }

    public boolean addKnowledge(ArrayList<String> list, String knowledge) {
        if (!list.contains(knowledge)) {
            list.add(knowledge);
            return true;
        }
        return false;
    }

    public boolean removeKnowledge(ArrayList<String> list, String knowledge) {
        if (list.contains(knowledge)) {
            list.remove(knowledge);
            return true;
        }
        return false;
    }
}
