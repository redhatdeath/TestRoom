package ru.shanin.data;

import java.util.ArrayList;
import java.util.Collections;

import ru.shanin.domain.entity.Worker;
import ru.shanin.domain.entity.WorkerInfo;
import ru.shanin.domain.entity.WorkerKnowledge;

public class RandomWorker {
    public static String genNumber(int length) {
        String digits = "0123456789";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++)
            result.append(digits.charAt((int) (Math.random() * 10)));
        return result.toString();
    }

    public static String genPhoneNumber() {
        return "+79" + genNumber(9);
    }

    public static String genString(int length) {
        String alphabetInUpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String alphabetInLowerCase = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder result = new StringBuilder();
        result.append(alphabetInUpperCase.charAt((int) (Math.random() * 26)));
        for (int i = 0; i < length - 1; i++)
            result.append(alphabetInLowerCase.charAt((int) (Math.random() * 26)));
        return result.toString();
    }

    public static String genLastName() {
        return genString(
                (int) (Math.random() * 3 + 5)
        );
    }

    public static String genFirstName() {
        return genString(
                (int) (Math.random() * 3 + 5)
        );
    }

    public static String genSecondName() {
        return genString(
                (int) (Math.random() * 5 + 7)
        );
    }

    public static ArrayList<String> genListOfKnowledge() {
        String[] knowledge = {
                " C++/CLI ", " C# ", " Object Pascal ", " Groovy ",
                " Java ", " JavaScript ", " Objective-C ", " Perl ",
                " PHP ", " Python ", " Ruby ", " Swift ",
                " Visual Basic ", " Ada ", " Erlang ", " Gentee ",
                " Haskell ", " Scheme ", " Lisp ", " Kotlin ",
                " Curry ", " Delphi ", " Rust ", " Scala "
        };
        ArrayList<String> listOfKnowledge = new ArrayList<>();
        for (int i = 0; i < (int) (Math.random() * 3 + 1); i++)
            listOfKnowledge.add(knowledge[(int) (Math.random() * knowledge.length)]);
        Collections.sort(listOfKnowledge);
        return listOfKnowledge;
    }

    public static Worker newWorker() {
        String ln = genLastName();
        String fn = genFirstName();
        String sn = genSecondName();
        ArrayList<String> interest = genListOfKnowledge();
        ArrayList<String> ignored = genListOfKnowledge();
        return new Worker(
                new WorkerInfo(
                        ln + "",
                        fn + "",
                        sn + "",
                        genPhoneNumber() + "",
                        ln + "_" + fn + "@gmail.com"),
                new WorkerKnowledge(
                        interest,
                        ignored
                )
        );
    }
}