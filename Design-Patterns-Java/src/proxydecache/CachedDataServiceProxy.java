package proxydecache;

import java.util.HashMap;
import java.util.Map;

public class CachedDataServiceProxy implements DataService {

    private RealDataService realDataService;
    private Map<String, String> cache;

    public CachedDataServiceProxy() {
        this.realDataService = new RealDataService();
        this.cache = new HashMap<>();
    }

    @Override
    public String fetchData(String query) {
        if (cache.containsKey(query)) {
            System.out.println("Returning cached data for query: " + query);
            return cache.get(query);
        }

        String data = realDataService.fetchData(query);
        cache.put(query, data);
        return data;
    }
}
