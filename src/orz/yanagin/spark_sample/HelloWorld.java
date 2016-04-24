package orz.yanagin.spark_sample;

import static spark.Spark.get;

public class HelloWorld {

	public static void main(String[] args) {
		get("/hello", (request, response) -> "Hello World");
	}
	
}
