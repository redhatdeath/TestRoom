package ru.shanin.domain.usecases;

import ru.shanin.domain.entity.Worker;
import ru.shanin.domain.repositories.WorkerDomainRoomRepository;

public class AddNewUseCase {
    private final WorkerDomainRoomRepository repository;

    public AddNewUseCase(WorkerDomainRoomRepository repository) {
        this.repository = repository;
    }

    public void addNew(Worker worker) {
        repository.addNew(worker);
    }
}