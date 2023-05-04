package ru.shanin.domain.usecases;

import ru.shanin.domain.repositories.WorkerDomainRoomRepository;

public class DeleteByIdUseCase {
    private final WorkerDomainRoomRepository repository;

    public DeleteByIdUseCase(WorkerDomainRoomRepository repository) {
        this.repository = repository;
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

}