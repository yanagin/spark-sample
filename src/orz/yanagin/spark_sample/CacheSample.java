package orz.yanagin.spark_sample;

import static spark.Spark.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CacheSample {

	public static void main(String[] args) {
		get("/cache", (request, response) -> "Cache " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
		
		after((request, response) -> {
			response.header("Cache-Control", "private, max-age=180");
		});
	}
	
}
