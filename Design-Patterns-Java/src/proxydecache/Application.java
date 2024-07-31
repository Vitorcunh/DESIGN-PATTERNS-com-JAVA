package proxydecache;

public class Application {
  public static void main(String[] args) {
      DataService dataService = new CachedDataServiceProxy();

      // Primeira consulta: resultado será buscado e armazenado em cache
      System.out.println(dataService.fetchData("SELECT * FROM users")); // Fará a consulta

      // Segunda consulta com a mesma query: resultado será retornado do cache
      System.out.println(dataService.fetchData("SELECT * FROM users")); // Retornará do cache

      // Consulta com uma query diferente: resultado será buscado e armazenado em cache
      System.out.println(dataService.fetchData("SELECT * FROM orders")); // Fará a consulta

      // Repetindo a consulta anterior: resultado será retornado do cache
      System.out.println(dataService.fetchData("SELECT * FROM orders")); // Retornará do cache
  }
}
