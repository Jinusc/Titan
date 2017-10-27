package external;

import java.util.List;

import entity.item;

public interface ExternalAPI {

	public List<item> search(double lat, double lon, String term);
}
