package ru.shanin.domain.repositories;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import ru.shanin.domain.entity.Worker;

public interface WorkerDomainRoomRepository {
    void addNew(Worker worker);

    void editById(Worker worker);

    void deleteById(String id);

    MutableLiveData<ArrayList<Worker>> getAll();

    MutableLiveData<Worker> getById(String id);
}