package ru.shanin.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import ru.shanin.domain.entity.Worker;
import ru.shanin.domain.repositories.WorkerDomainRoomRepository;

public class GetByAllUseCase {

    private final WorkerDomainRoomRepository repository;

    public GetByAllUseCase(WorkerDomainRoomRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<ArrayList<Worker>> peopleGetByAll() {
        return repository.getAll();
    }

}