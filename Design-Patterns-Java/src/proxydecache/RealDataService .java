package proxydecache;

public class RealDataService implements DataService {

  @Override
  public String fetchData(String query) {
      // Simula uma operação custosa, como uma consulta a um banco de dados
      System.out.println("Fetching data for query: " + query);
      try {
          Thread.sleep(2000); // Simula um atraso
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      return "Data for " + query;
  }
}