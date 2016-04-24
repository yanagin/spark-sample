package orz.yanagin.spark_sample;

import static spark.Spark.get;

public class ParameterSample {
	
	public static void main(String[] args) {
		// http://localhost:4567/queryParam?param=123
		get("/queryParam", (request, response) -> {
			return "param->" + request.queryParams("param");
		});

		// http://localhost:4567/pathParam/123
		get("/pathParam/:param", (request, response) -> {
			return "param->" + request.params("param");
		});
	}

}
