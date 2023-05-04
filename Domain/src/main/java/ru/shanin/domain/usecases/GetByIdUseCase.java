package ru.shanin.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import ru.shanin.domain.entity.Worker;
import ru.shanin.domain.repositories.WorkerDomainRoomRepository;

public class GetByIdUseCase {
    private final WorkerDomainRoomRepository repository;

    public GetByIdUseCase(WorkerDomainRoomRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<Worker> peopleGetById(String id) {
        return repository.getById(id);
    }
}