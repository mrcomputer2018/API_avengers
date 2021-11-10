package br.com.devin.avengers.model.dao;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class AvengerDao {

    public static List<String> oldAvengers = Arrays.asList("Capitao america", "Hulk", "Viuva negra", "Gaviao arqueiro");

    public List<String> listOldAvengers() {
        return oldAvengers;
    }
}
