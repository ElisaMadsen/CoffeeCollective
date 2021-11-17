package database;

import statistics.CustomerBasket;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {
    public void readFile(CustomerBasket order) {
    try {
        File file = new File("Receipts/Receipt.txt");
        FileWriter receipt = new FileWriter(file,true);

        receipt.write(order + "\n\n");


        receipt.close();

    } catch (IOException e) {
        System.out.println("file couldn't be found");
        e.printStackTrace();
    }
    }
}
