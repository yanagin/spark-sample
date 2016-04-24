package orz.yanagin.spark_sample;

import static spark.Spark.get;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class JsonSample {
	
	public static void main(String[] args) {
		// http://localhost:4567/toJson/name/value
		get("/toJson/:name/:value", (request, response) -> {
			Map<String, String> map = new HashMap<>();
			map.put(request.params("name"), request.params("value"));
			return map;
		}, new JsonTransformer());

		Gson gson = new Gson();
		get("/toJsonJava8/:name/:value", (request, response) -> {
			Map<String, String> map = new HashMap<>();
			map.put(request.params("name"), request.params("value"));
			return map;
		}, gson::toJson);
	}

}
