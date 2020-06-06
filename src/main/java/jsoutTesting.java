import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class jsoutTesting {
    public static void main(String[] args) throws IOException {
        final String url = "https://preciosmundi.com/chile/precios-supermercado";


        try{
            final Document documento = Jsoup.connect(url).get();

            for(Element row : documento.select("table.tableresponsive tr")){
                final String ticker = row.select(".price").text();
                System.out.println(ticker);

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
