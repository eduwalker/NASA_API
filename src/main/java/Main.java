import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ModelJsonNasa modelNasa = new ModelJsonNasa();
        ModelJsonNasaTemp modelTemp = new ModelJsonNasaTemp();
        ObjectMapper objectMapper = new ObjectMapper();

        String url = modelNasa.jsonUrlKey("https://api.nasa.gov/planetary/apod?api_key=");
        String url2 = modelTemp.jsonUrlKey("https://api.nasa.gov/DONKI/IPS?startDate=2023-01-01&endDate=2023-02-28&location=Earth&catalog=ALL&api_key=");

        try {
            ModelJsonNasaTemp[] myModels = objectMapper.readValue(new URL(url2), ModelJsonNasaTemp[].class);
            List<ModelJsonNasaTemp> myModelList = Arrays.asList(myModels);

            // Processar os dados conforme necessário
            for (ModelJsonNasaTemp myModel : myModelList) {
                System.out.println("Catalog: " + myModel.getCatalog());
                System.out.println("Activity ID: " + myModel.getActivityID());
                System.out.println("Location: " + myModel.getLocation());
                System.out.println("Event Time: " + myModel.getEventTime());
                System.out.println("Link: " + myModel.getLink());

                List<Instrument> instruments = myModel.getInstruments();
                System.out.println("Instruments:");
                for (Instrument instrument : instruments) {
                    System.out.println("- " + instrument.getDisplayName());
                }

                System.out.println("-----------------------------------\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
