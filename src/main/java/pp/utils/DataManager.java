/*
 * Nome: Pedro Marques
 * Número: 8190750
 * Turma: <LSIRC12T2>
 *
 * Nome: Francisco Faria
 * Número: 8180335
 * Turma: <Turma do colega de grupo>
 */


package main.java.pp.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class DataManager {

    private static final String FILE_NAME = "data.json";
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static <T> void writeData(T data) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T readData(Class<T> classOfT) {
        T data = null;
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("Não foi possível criar o ficheiro de dados", e);
            }
        }
        try (FileReader reader = new FileReader(file)) {
            data = gson.fromJson(reader, classOfT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
