package orz.yanagin.spark_sample;

import static spark.Spark.get;

import java.util.HashMap;
import java.util.Map;

public class JsonSample {
	
	public static void main(String[] args) {
		// http://localhost:4567/toJson/name/value
		get("/toJson/:name/:value", (request, response) -> {
			Map<String, String> map = new HashMap<>();
			map.put(request.params("name"), request.params("value"));
			return map;
		}, new JsonTransformer());
	}

}
