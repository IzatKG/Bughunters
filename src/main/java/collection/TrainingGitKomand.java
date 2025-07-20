package collection;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class TrainingGitKomand {
    public static void main(String[] args) {
        Map<String, String> gitKomands = new HashMap<>();
        gitKomands.put("Git Komandy ", " Znacheniya komand");
        gitKomands.put("ls ", " Pokazyvaset soderjimoe");
        gitKomands.put("ls -l ", " Detal'naya informac'iya po spisku");
        gitKomands.put("cd / ", " Vozvrashaet shag nazad");
        gitKomands.put("pwd ", " Pokazyvaet put' faila");
        gitKomands.put("mkdir ", " Sozdaet papku");
        gitKomands.put("touch ", " Sozdaet fail");
        gitKomands.put("rm ", " Udalit fail");
        gitKomands.put("mv ", " Pereimenovat' i peremestit");
        gitKomands.put("rm -r ", " Udalit papku");
        gitKomands.put("cat ", " Proverka soderjimoe faila");
        gitKomands.put("vim ", " redaktirovanie faila");
        gitKomands.put("git init ", " Iniciyaliziruet repozitori");
        gitKomands.put("git add . " , " Dobavit fail v git");
        gitKomands.put("git commit -m ", " Dobavit kommentari");
        gitKomands.put("push -u orijin nazvanie ", " Otpravit v repozitori");
        gitKomands.put("git branch ", " Pokazyvaet kake vetki est' ");
        gitKomands.put("git branch name ", " Sozdaet novuiy vetku");
        gitKomands.put("git checkout ", " Perekliychaet na vetku");
        gitKomands.put("git pull origin master ", " Obnovleniya mastera");
        gitKomands.put("git status ", " Pokazyvaet sostoyanie vetki");
        gitKomands.put("git fetch ", " Proveryat sostoyanie vetki udalennogo i lokal'nogo");
        gitKomands.put("git merge master ", " Sliyanie svoei vetki s masterom ");
        gitKomands.put("git pull ", " Obnovleniya mastera varyant");
        gitKomands.put("git branch -d ", " Udalyaet vetku");
        gitKomands.put("git checkout -b ", " Sozdaet vetku i perekliychaet");

        System.out.println("Spisok GIT KOMAND");
        System.out.println(gitKomands.size());
        System.out.println(gitKomands);
        for (Map.Entry<String, String> entry : gitKomands.entrySet()){
            System.out.println(entry);
        }

    }
}
