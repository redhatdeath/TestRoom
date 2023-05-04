package ru.shanin.domain.usecases;

import ru.shanin.domain.entity.Worker;
import ru.shanin.domain.repositories.WorkerDomainRoomRepository;

public class EditByIdUseCase {
    private final WorkerDomainRoomRepository repository;

    public EditByIdUseCase(WorkerDomainRoomRepository repository) {
        this.repository = repository;
    }

    public void editById(Worker worker) {
        repository.editById(worker);
    }
}