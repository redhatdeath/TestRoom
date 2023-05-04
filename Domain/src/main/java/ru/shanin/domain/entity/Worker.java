package ru.shanin.domain.entity;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;

import ru.shanin.domain.entity.helpers.ComparatorByLastFirstSecondWorkerName;
import ru.shanin.domain.entity.helpers.ConverterToString;

public class Worker {
    public static final Comparator<Worker> byLFN;

    static {
        byLFN = new ComparatorByLastFirstSecondWorkerName();
    }

    private final String id;
    private final WorkerInfo info;
    private final WorkerKnowledge knowledge;


    public Worker(WorkerInfo info, WorkerKnowledge knowledge) {
        this.info = info;
        this.knowledge = knowledge;
        this.id = createId();
    }

    private String createId() {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No SHA256 Algorithm");
        }
        byte[] encodedHash = digest.digest(this.getInfo().toString().getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder(2 * encodedHash.length);
        for (byte hash : encodedHash) {
            String hex = Integer.toHexString(0xff & hash);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public String getId() {
        return id;
    }

    public WorkerInfo getInfo() {
        return info;
    }

    public WorkerKnowledge getKnowledge() {
        return knowledge;
    }

    @Override
    public String toString() {
        return ConverterToString.makeJsonString(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Worker guest = (Worker) obj;
        return id.equals(guest.getId())
                && (info == guest.getInfo() || (info != null && info.equals(guest.getInfo())))
                && (knowledge == guest.getKnowledge() || (knowledge != null && knowledge.equals(guest.getKnowledge())));
    }
}
