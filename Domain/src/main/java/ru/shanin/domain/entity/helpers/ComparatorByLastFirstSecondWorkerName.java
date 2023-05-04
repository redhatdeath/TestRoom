package ru.shanin.domain.entity.helpers;

import java.util.Comparator;

import ru.shanin.domain.entity.Worker;

public class ComparatorByLastFirstSecondWorkerName implements Comparator<Worker> {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        String ln1 = worker1.getInfo().getLastName();
        String ln2 = worker2.getInfo().getLastName();
        String fn1 = worker1.getInfo().getFirstName();
        String fn2 = worker2.getInfo().getFirstName();
        String sn1 = worker1.getInfo().getSecondName();
        String sn2 = worker2.getInfo().getSecondName();
        int result;
        result = ln1.compareTo(ln2);
        if (result != 0) return result;
        result = fn1.compareTo(fn2);
        if (result != 0) return result;
        else return sn1.compareTo(sn2);
    }
}
